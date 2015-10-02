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
public interface I_IngredienteFactory{
    
    public Ingrediente criarIngrediente(String nome, int qtd);
}
