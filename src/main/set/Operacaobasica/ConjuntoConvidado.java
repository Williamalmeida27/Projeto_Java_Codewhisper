package main.set.Operacaobasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //Setando variável do tipo Set para o conjunto de convidados.
    private Set<Convidado> convidadosSet;

    //Construtor usando hashSet para o conjunto de convidados tornando único.
    public ConjuntoConvidado() {
        this.convidadosSet = new HashSet<>();
    }
    
    //Metódo para retornar o set de convidados
    public Set<Convidado> getConvidados() {
        return convidadosSet;
    }
    
    //Meétodo para adicionar um convidado no set
    public void adicionarConvidado(String nome, int codigoConvite){        
        convidadosSet.add(new Convidado(nome, codigoConvite));
    
    }

    //Meótodo para remover um convidado do conjunto usado no set
    public void removerConvidado(String nome){
        for (Convidado c : convidadosSet) {
            if (c.getNome().equals(nome)) {
                convidadosSet.remove(c);
                break;
            }
        }
    }

    //Metódo para contar quantos convidados tem no set
    public int quantidadeConvidados(){
        return convidadosSet.size();
    }

}