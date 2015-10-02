/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.cdp;

/**
 *
 * @author Gabriela Pontes
 */
public class Ingrediente {
    
    private String nome;
    private int qtd;

    public Ingrediente(){}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public String toString(){
        return nome;
    }
}
