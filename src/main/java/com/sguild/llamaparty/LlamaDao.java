/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.llamaparty;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class LlamaDao {
    
    private List<String> partyGoers = new ArrayList<>();
    private int totalLlamas = 0;
    
    public LlamaDao() {
    
    }
    
    public List<String> getPartyGoers() {
        List<String> guestList = new ArrayList<>();
        for (String guest : partyGoers) {
            guestList.add(guest);
        }
        return guestList;
    }
    
    public int getTotalLlamas() {
        return totalLlamas;
    }
    
    public void addPartyGoer(String partyGoer) {
        partyGoers.add(partyGoer);
    }
    
    public void addLlamas(int Llamas) {
        totalLlamas += Llamas;
    }
    
    
    
}
