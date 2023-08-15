package main.map.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    private Map< Integer, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Integer cod, String nome, int quantidade, double preco ) {
        this.estoqueProdutos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        if (!estoqueProdutos.isEmpty()) {
            for (Map.Entry<Integer, Produto> entry : estoqueProdutos.entrySet()) {
                System.out.println(entry.getValue());
            }
        } else {
            throw new RuntimeException("Não há produtos cadastrados");            
        }
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0d;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto produto : estoqueProdutos.values()) {
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }
        } else {
            throw new RuntimeException("Não há produtos cadastrados");            
        }
        return valorTotal;
    
    }
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProdutos.values()) {
            if (p.getPreco() > maiorPreco) {
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
            for (Produto p : estoqueProdutos.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
            return produtoMaisBarato;
        }



    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(1, "Bola", 10, 5.5);
        estoque.adicionarProduto(2, "Boneca", 5, 10.5);
        estoque.adicionarProduto(3, "Bola", 10, 2.5);
        estoque.exibirProdutos();
        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.obterProdutoMaisBarato());
    
    }
}
