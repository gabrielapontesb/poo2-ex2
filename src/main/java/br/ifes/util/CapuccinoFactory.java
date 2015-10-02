/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.util;

import br.ifes.cdp.Cafe;
import br.ifes.cdp.Ingrediente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriela Pontes
 */
public class CapuccinoFactory implements I_CafeFactory {
    final double PRICE = 5.0; 
    
    public Cafe criarCafe() {
        Cafe ca = new Cafe();
        ca.setPreco(PRICE);
        ca.setIngredientes((ArrayList<Ingrediente>) fabricarIngredientes());
        return ca;
    }

    @Override
    public List<Ingrediente> fabricarIngredientes() {
        IngredienteFactory ifac = new IngredienteFactory();
        ArrayList<Ingrediente> ingred = new ArrayList<>();
        ingred.add(ifac.criarIngrediente("cafe soluvel", 100));
        ingred.add(ifac.criarIngrediente("acucar", 200));
        ingred.add(ifac.criarIngrediente("leite em po", 100));
        ingred.add(ifac.criarIngrediente("bicabornato", 1));
        ingred.add(ifac.criarIngrediente("chocolate em po", 50));
        ingred.add(ifac.criarIngrediente("canela", 1));
        ingred.add(ifac.criarIngrediente("agua", 100));
        
        return ingred;
    }
}
