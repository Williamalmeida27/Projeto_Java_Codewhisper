package main.set.Operacaobasica;

public class Convidado {
    private String nome;
    private int codigoConvidado;

    //Apenas os getters pois no conjunto set não tem opção de setters.
    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    //Construtor
    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }   

    //toString
    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", CodigoConvidado=" + codigoConvidado + "]";
    }

    //Usando metodo hashCode e equals para comparar os objetos e não permite a duplicação de item
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvidado;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvidado != other.codigoConvidado)
            return false;
        return true;
    }


    
}
