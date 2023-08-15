package main.list.OperacaoBasica;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {
    private List<Tarefa> listTarefas;

    public ListaTarefas() {
        this.listTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!listTarefas.isEmpty()) {
            for (Tarefa t : listTarefas) {
            if (t.getDescricacao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            } 
            }
            listTarefas.removeAll(tarefasParaRemover);
        }else {
            throw new RuntimeException("Nenhuma tarefa cadastrada.");
        }
    }

    public int obterNumeroTotalTarefas(){
        return listTarefas.size();
    }

    public void obterListaTarefas() {
        if (!listTarefas.isEmpty()) {
            System.out.println(listTarefas);
        } else {
            throw new RuntimeException("Nenhuma tarefa cadastrada.");
        }     
    }
    
}
