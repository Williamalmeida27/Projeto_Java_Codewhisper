package main.map.Operacaobasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

    private Map<String, Integer> agendaContato;

    public AgendaContato() {
        this.agendaContato = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        this.agendaContato.put(nome, numero);
    }

    public void removerContato(String nome) {
        this.agendaContato.remove(nome);
    }

    public void listarContato() {
        if (!agendaContato.isEmpty()) {
                System.out.println(agendaContato);
        }
    }   
    
    public Integer buscarNumeroContato(String nome) {
        Integer contatoPorNumero = null;
        if (!agendaContato.isEmpty()) {
            contatoPorNumero = agendaContato.get(nome);
        }
        return contatoPorNumero;
    }   

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("William", 1234567891);
        agendaContato.adicionarContato("Willian", 1234567891);
        agendaContato.listarContato();
        agendaContato.removerContato("Willian");
         agendaContato.listarContato();
    }

}
