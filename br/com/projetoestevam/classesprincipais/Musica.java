package br.com.projetoestevam.classesprincipais;

public class Musica extends Audio implements Informacoes {
    private int curtidas;
    private String cantor;
    private String album;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getCantor() {
        return cantor;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void curtir (int totalCurtidas) {
        if(isReproduziu()) {
            if (getTotalDeReproducoes() < totalCurtidas){
                System.out.println("Quantidade de curtidas inválida");
            } else {
                curtidas += totalCurtidas;
            }
        } else {
            System.out.println("Para curtir, primeiro reproduza o áudio!");
        }

    }
    @Override
    public void printDasInformacoes() {
        System.out.println("O nome da Música escolhida é " + getTitulo() + " que está no album " + getAlbum() + ". O gênero dessa música é: " +  getGenero());
        System.out.println("O cantor/a dessa música é " + cantor);
        System.out.println("A duração dessa música é de " + getDuracao() + " minutos");
        System.out.println("O total de visualizações é de " + getTotalDeReproducoes() + " visualizações. A música ja conta com " + curtidas + " likes!!!");
        if (curtidas >= 500){
            System.out.println("Música amada pelo público.\n");
        } else {
            System.out.println("Adicione-a para a ouvir depois!\n");
        }


    }
}
