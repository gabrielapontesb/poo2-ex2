/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.cdp.Cafe;
import br.ifes.cdp.Ingrediente;
import br.ifes.util.CafeFactory;
import br.ifes.util.CapuccinoFactory;
import br.ifes.util.DescafeinadoFactory;
import br.ifes.util.NormalFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriela Pontes
 */

public class Teste {
        
    @Test
    public void IngredientesNormal(){
        NormalFactory norm = new NormalFactory();
        assertEquals("Meus ingredientes: cafe soluvel acucar leite agua", norm.criarCafe().toString());   
    }
    
    @Test
    public void IngredientesCapuccino() {
        CapuccinoFactory capucc = new CapuccinoFactory();
        assertEquals("Meus ingredientes: cafe soluvel acucar leite em po bicabornato chocolate em po canela agua", capucc.criarCafe().toString()); 
    }
    
    @Test
    public void IngredientesDescafeinado(){
        DescafeinadoFactory descaf = new DescafeinadoFactory();
        assertEquals("Meus ingredientes: cafe descafeinado acucar leite agua", descaf.criarCafe().toString());   
    }
    
    /*@Test
    public void PrecoFactory(){
        Cafe cafe = new CafeFactory().criarCafe("DECAF");
        assertEquals(3.0, cafe.getPreco());
    }
    
    @Test
    public void Ingrediente(){
        Ingrediente ingred = new Ingrediente();
        assertEquals("acucar", ingred.getNome());
        assertEquals(100, ingred.getQtd());
    }*/
    

}
