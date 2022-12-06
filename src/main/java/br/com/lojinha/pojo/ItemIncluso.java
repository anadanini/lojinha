package br.com.lojinha.pojo;

public class ItemIncluso {
//atributos
   private String nomeJogo;
   private int quantidade;

// Construtor

    public ItemIncluso(String nomeInicial, int quantidadeInicial){
        this.nomeJogo = nomeInicial;
        this.quantidade = quantidadeInicial;

    }

// Métodos

    public String getNomeJogo (){
        return this.nomeJogo;
    }
    public void setNomeJogo(String novoNomeJogo){
        this.nomeJogo = novoNomeJogo;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }
}
