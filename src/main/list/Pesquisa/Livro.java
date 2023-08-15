package main.list.Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicação;
    
    public Livro(String titulo, String autor, int anoPublicação) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicação = anoPublicação;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicação() {
        return anoPublicação;
    }

    public void setAnoPublicação(int anoPublicação) {
        this.anoPublicação = anoPublicação;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicação=" + anoPublicação + "]";
    }

    
}
