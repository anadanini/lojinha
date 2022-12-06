package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.MÉDIO);

        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(30);
        meuProduto.setTamanho(Tamanho.GRANDE);
        meuProduto.setMarca("JL");

        List<ItemIncluso>itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add (primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo", 3);
        itensInclusos.add (segundoItemIncluso);


        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de energia", 2);
        itensInclusos.add (terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        //System.out.println(meuProduto.getTamanho());

        //System.out.println(meuProduto.getItensInclusos().get(1));

        //System.out.println(meuProduto.getValor());

        //System.out.println(meuProduto.getMarca());

        //Sem laço - 6 linhas de código
        //System.out.println(meuProduto.getItensInclusos().get(0).getNomeJogo());
        //System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());
        //System.out.println(meuProduto.getItensInclusos().get(1).getNomeJogo());
        //System.out.println(meuProduto.getItensInclusos().get(1).getQuantidade());
        //System.out.println(meuProduto.getItensInclusos().get(2).getQuantidade());
        //System.out.println(meuProduto.getItensInclusos().get(2).getQuantidade());


        //Interagir com listas em laço utilizando FOR IN - 4 linhas de código. É possível navegar pela lista inteira.

        //for(ItemIncluso itemAtual: meuProduto.getItensInclusos()){
            //System.out.println(itemAtual.getNomeJogo());
            //System.out.println(itemAtual.getQuantidade());
        //}

        //System.out.println("Acabaram-se os itens");


        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MÉDIO);
        meuProdutoNacional.setImpostoNacional(0.58);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("LG", Tamanho.PEQUENO);
        meuProdutoInternacional.setImpostoInternacional(0.56888);
        System.out.println(meuProdutoInternacional.getImpostoInternacional());

        meuProdutoInternacional.setValor(-101);
    }

}
