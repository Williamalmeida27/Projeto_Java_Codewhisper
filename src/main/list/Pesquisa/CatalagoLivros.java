package main.list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalagoLivros {
    private List<Livro> listLivros;
    
    public CatalagoLivros() {
        this.listLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.listLivros.add(new Livro(titulo, autor, anoPublicacao));
    
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> resultadoPorAutor = new ArrayList<>();

        if (!listLivros.isEmpty()) {
            for (Livro l : listLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    resultadoPorAutor.add(l);
                } 
            }
            return resultadoPorAutor;
        } else {
            throw new RuntimeException("Nenhuma tarefa cadastrada.");
        }
    }

    public List<Livro> pesquisarPorAno (int anoInicial, int anoFinal){
        List<Livro> resultadoPorAno = new ArrayList<>();
        if (!listLivros.isEmpty()) {
            for (Livro l : listLivros) {
                if (l.getAnoPublicação() >= anoInicial && l.getAnoPublicação() <= anoFinal) {
                    resultadoPorAno.add(l);
                } 
            }
            return resultadoPorAno;
        }else {
            throw new RuntimeException("Nenhuma tarefa cadastrada.");
        }
    }

    public List<Livro> pesquisarPorTitulo (String titulo){
        List<Livro> resultadoPorTitulo = new ArrayList<>();
        if (!listLivros.isEmpty()) {
            for (Livro l : listLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    resultadoPorTitulo.add(l);
                    break;
                }
            }
            return resultadoPorTitulo;
        } else {
            throw new RuntimeException("Nenhuma tarefa cadastrada.");
        }
    } 
}
