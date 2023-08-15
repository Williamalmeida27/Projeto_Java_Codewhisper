package main.list.OperacaoBasica;

public class Tarefa {
    private String descricacao;

    public Tarefa(String descricacao) {
        this.descricacao = descricacao;
    }

    public String getDescricacao() {
        return descricacao;
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }

    @Override
    public String toString() {
        return "Tarefa [descricacao=" + descricacao + "]";
    }

    
}
