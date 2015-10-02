/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.util;

import br.ifes.cdp.Cafe;
import br.ifes.cdp.Ingrediente;
import java.util.List;

/**
 *
 * @author Gabriela Pontes
 */
public interface I_CafeFactory {

    public Cafe criarCafe();
    public List<Ingrediente> fabricarIngredientes();
}
