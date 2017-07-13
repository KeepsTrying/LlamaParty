/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.llamaparty;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class rsvpController {

    LlamaDao dao = new LlamaDao();

    @RequestMapping(value = "rsvp", method = RequestMethod.GET)
    public String rsvpSplash(HttpServletRequest request, Map<String, Object> model) {
        return "rsvpSplash";
    }

    @RequestMapping(value = "rsvp", method = RequestMethod.POST)
    public String attending(HttpServletRequest request, Map<String, Object> model) {
        String attending = request.getParameter("attending");
        String stringNumOfLlamas = request.getParameter("numOfLlamas");
        int numOfLlamas;
        String userName = request.getParameter("userName");
        
        if (userName.isEmpty()) {
            return "noName";
        }
        
        try {
        numOfLlamas = Integer.parseInt(stringNumOfLlamas);
        } catch (NumberFormatException | NullPointerException e) {
            return "noLlamas";
        }
        
        if (numOfLlamas < 0) {
            return "negLlamas";
        }
        
        

        if (attending.equalsIgnoreCase("no")) {
            return "rsvpNo";
        } else if (attending.equalsIgnoreCase("yes")) {

            dao.addLlamas(numOfLlamas);
            model.put("numOfLlamas", numOfLlamas);

            
            dao.addPartyGoer(userName);
            model.put("userName", userName);

            int numOfGuests = dao.getPartyGoers().size();

            double doubleNumOfGuests = (double) numOfGuests;
            double doubleNumOfLlamas = (double) dao.getTotalLlamas();
            double avgLlamas = doubleNumOfLlamas / doubleNumOfGuests;

            model.put("avgLlamas", avgLlamas);

            return "rsvpYes";
        } else {
            return "noTricksters";
        }
    }

    @RequestMapping(value = "partyList", method = RequestMethod.GET)
    public String partyList(HttpServletRequest request, Map<String, Object> model) {
        model.put("partyGoers", dao.getPartyGoers());

        return "partyList";
    }

}
