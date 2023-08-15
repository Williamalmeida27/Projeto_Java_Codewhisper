package main.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        this.produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> exibirProdutos = new TreeSet<>(produtosSet);
        if (!produtosSet.isEmpty()) {
            return exibirProdutos;
        } else {
            throw new RuntimeException("Nenhum produto cadastrado.");
        }
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> exibirProdutos = new TreeSet<>(new ComparaToProduto());
        if (!produtosSet.isEmpty()) {
            exibirProdutos.addAll(produtosSet);
            return exibirProdutos;
        } else {
            throw new RuntimeException("Nenhum produto cadastrado.");
        }
    }
}
        

