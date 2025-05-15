/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappestoqueprod;

/**
 *
 * @author xxx
 */
public class Produto {
    // Atributos
    private String nome;
    private int qtd;
    private double valor;
    
    // Métodos
    public Produto() {
    }
    public Produto(String p_nome, int p_qtd, double p_valor) {
        this.nome = p_nome;
        this.qtd = p_qtd;
        this.valor = p_valor;
    }
    public void setNome(String p_nome) {
        this.nome = p_nome;
    }
    public void setQtd(int p_qtd) {
        this.qtd = p_qtd;
    }
    public void setValor(double p_valor) {
        this.valor = p_valor;
    }
    public String getNome() {
        return this.nome;
    }
    public int getQtd() {
        return this.qtd;
    }
    public double getValor() {
        return this.valor;
    }        
}
