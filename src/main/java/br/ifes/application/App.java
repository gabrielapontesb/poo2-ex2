package br.ifes.application;

import br.ifes.util.CafeFactory;

public class App {
    public static void main(String args[]){
        CafeFactory cf = new CafeFactory();
        
        System.out.print(cf.criarCafe("descafeinado"));
        System.out.print(cf.criarCafe("capuccino"));
        System.out.print(cf.criarCafe("normal"));
    }
}
