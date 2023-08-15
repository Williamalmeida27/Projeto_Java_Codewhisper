package main.map.Ordenacao;

import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;
import java.util.HashMap;

public class AgendaEvento {
    private Map<LocalDate, Evento> agendaEvento;

    public AgendaEvento() {
        this.agendaEvento = new HashMap<>();
    }

    // TODO metódo de inserir envento, exibir e ver o próximo evento.
    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        this.agendaEvento.put(data, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirEventos() {
        for (Map.Entry<LocalDate, Evento> evento : this.agendaEvento.entrySet()) {
            System.out.println(evento.getKey() + " - " + evento.getValue());
        }
    }

    public void verProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataProximoEvento = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEvento);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                dataProximoEvento = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + dataProximoEvento);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();
        agendaEvento.adicionarEvento(LocalDate.of(2022, 10, 10), "Festa", "Praia");
        agendaEvento.adicionarEvento(LocalDate.of(2022, 11, 10), "Festa", "Praia");
        agendaEvento.exibirEventos();
    }
}