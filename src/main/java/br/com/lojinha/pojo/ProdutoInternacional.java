package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    //tributo
    private double impostoInternacional;

    //Construtor
    public ProdutoInternacional(String nomeInicial, Tamanho tamanhoInicial) {
        super(nomeInicial, tamanhoInicial);
    }

    //métodos

    public  void setValor( double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Os valores precisam ser maiores do que -100");
        }
    }
    public double getImpostoInternacional(){
        return this.impostoInternacional;
    }

    public void setImpostoInternacional( double novoImpostoInternacional){
        this.impostoInternacional = novoImpostoInternacional;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
