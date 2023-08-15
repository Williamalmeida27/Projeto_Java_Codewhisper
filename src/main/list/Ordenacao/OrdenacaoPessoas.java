package main.list.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {
    private List<Pessoa> listPessoas;

    public OrdenacaoPessoas(){
        this.listPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, int altura){
        this.listPessoas.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPessoasPoridade(){
        List<Pessoa> listPessoasOrdenadas = new ArrayList<>(listPessoas);
        if(!listPessoas.isEmpty()){
            Collections.sort(listPessoasOrdenadas);
            return listPessoasOrdenadas;
        }else{
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Pessoa> ordenarPessoasPorAltura(){
        List<Pessoa> listPessoasOrdenadas = new ArrayList<>(listPessoas);
        if(!listPessoas.isEmpty()){
            Collections.sort(listPessoasOrdenadas, new ComparePessoaPorAltura());
            return listPessoasOrdenadas;
        }else{
            throw new RuntimeException("Lista vazia");
        }
    }
}

