/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.util;

import br.ifes.cdp.Cafe;

/**
 *
 * @author Gabriela Pontes
 */
public class CafeFactory {
    public static final String DECAF = "descafeinado";
    public static final String NORMAL = "normal";
    public static final String CAPUCCINO = "capuccino";
    
    private DescafeinadoFactory descaf;
    private CapuccinoFactory capucc;
    private NormalFactory norm;
    
    public CafeFactory(){
        descaf = new DescafeinadoFactory();
        capucc = new CapuccinoFactory();
        norm = new NormalFactory();
    }
    
    public Cafe criarCafe(String cafe){
        switch (cafe){
            case DECAF:
                return criarDecaf();
            case NORMAL:
                return criarNormal();
            case CAPUCCINO:
                return criarCapucino(); 
        }
        
        return null;
    }
    
    private Cafe criarCapucino(){
        return capucc.criarCafe();
    }
    
    private Cafe criarDecaf(){
        return descaf.criarCafe();
    }
    
    private Cafe criarNormal(){
        return norm.criarCafe();
    }
    
    
}
