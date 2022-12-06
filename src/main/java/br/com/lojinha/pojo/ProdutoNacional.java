package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {

    private double taxaDeImportacao;

    public ProdutoNacional(String nomeInicial, Tamanho tamanhoInicial) {
        super(nomeInicial, tamanhoInicial);
    }

    public double getImpostoNacional(){
        return this.taxaDeImportacao;
    }

    public void setImpostoNacional( double novaTaxaImportacao){
        this.taxaDeImportacao = novaTaxaImportacao;
    }

    public String getDadosFavoritos(){
        return this.getNome() + ", " + this.getMarca() + "e " + this.getValor();
    }

}