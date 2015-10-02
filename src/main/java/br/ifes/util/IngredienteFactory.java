/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.util;

import br.ifes.cdp.Ingrediente;

/**
 *
 * @author Gabriela Pontes
 */
public class IngredienteFactory implements I_IngredienteFactory{

    @Override
    public Ingrediente criarIngrediente(String nome, int qtd) {
        Ingrediente ing = new Ingrediente();
        ing.setNome(nome);
        ing.setQtd(qtd);
        return ing;
    }
}
