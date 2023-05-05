package br.com.projetoestevam.classesprincipais;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private boolean reproduziu;


    public boolean isReproduziu() {
        return reproduziu;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void reproduzir (int totalDeReproducoes) {
        this.totalDeReproducoes += totalDeReproducoes;
        reproduziu = true;
    }
}
