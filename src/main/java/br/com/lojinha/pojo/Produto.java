package br.com.lojinha.pojo;


import br.com.lojinha.enums.Tamanho;

import java.util.List;


//CLASSE
public class Produto {
    //ATRIBUTOS
    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;

    // CONSTRUTOR

    public Produto(String nomeInicial, Tamanho tamanhoInicial) {
        this.marca = nomeInicial;
        this.tamanho = tamanhoInicial;
    }


//MÉTODOS - ENCAPSULAMENTO

    public double getValor(){
    return this.valor;
}
    public  void setValor( double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Os valores precisam ser maiores do que 0");
        }
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho){
        this.tamanho = novoTamanho;
    }

    public List<ItemIncluso> getItensInclusos(){
        return this.itensInclusos;
    }
    public void setItensInclusos(List<ItemIncluso> novoItensInclusos){
        this.itensInclusos = novoItensInclusos;
    }

}
