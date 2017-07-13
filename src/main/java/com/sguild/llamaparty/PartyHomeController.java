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
public class PartyHomeController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String toIndex(HttpServletRequest request, Map<String, Object> model){
        return "partyHome";
    }
    
}
