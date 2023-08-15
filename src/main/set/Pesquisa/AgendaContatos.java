package main.set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    // Construtor usando hashSet para o conjunto de contatos tornando único.
    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    // Metédo para adicionar um contato no set
    public void adicionarContato(String nome, String telefone) {
        contatosSet.add(new Contato(nome, telefone));
    }

    // Metédo para exibir contatos do set
    public void exibirContatos() {
        if (!contatosSet.isEmpty()) {
            for (Contato contato : contatosSet) {
                System.out.println(contato);
            }
        } else {
            System.out.println("Nenhum contato cadastrado.");
        }
    }

    // Metédo para pesquisar um contato no set por nome
    public Set<Contato> pesquisarContatos(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();

        if (!contatosSet.isEmpty()) {
            for (Contato c : contatosSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    contatosEncontrados.add(c);
                }
            }
        } else {
            throw new RuntimeException("Nenhum contato cadastrado.");

        }

        return contatosEncontrados;
    }

    public Contato atualizarContato(String nome, String novoNumero) {
        Contato contatoEncontrado = null;
        if (!contatosSet.isEmpty()) {
            for (Contato c : contatosSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setTelefone(novoNumero);
                    contatoEncontrado = c;
                    break;
                }
            }
            return contatoEncontrado;
        } else {
            throw new RuntimeException("Nenhum contato cadastrado.");

        }
        
    }
}
