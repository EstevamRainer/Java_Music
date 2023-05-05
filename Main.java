import br.com.projetoestevam.classesprincipais.Musica;
import br.com.projetoestevam.classesprincipais.Podcast;
import br.com.projetoestevam.metodos.ExibidorDeInformacoes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Java Music.");
        System.out.println("Aqui nós mostraremos infomações sobre suas Músicas ou Podcasts favoritos!!! \n");
        Podcast hipsters = new Podcast();
        hipsters.setTitulo("TechGuide: SPA e frameworks JavaScript");
        hipsters.setParticipantes("Paulo Silveira, Nayane Batista, Willian Grasel e Mário Souto");
        hipsters.setHost("Paulo Silveira");
        hipsters.setDescricao("Mais um episódio sobre TechGuide para vocês! \n Nesta conversa, vamos falar sobre SPA (Single-page Applications), \n o conceito por trás dessas páginas e alguns dos principais frameworks JavaScript atualmente.");
        hipsters.setDuracao(44);
        hipsters.reproduzir(100000);
        hipsters.darUmaNota(10, 2000);

        Musica myWay = new Musica();
        myWay.setTitulo("My Way (Remastered 2008)");
        myWay.setCantor("Frank Sinatra");
        myWay.setAlbum("Favoritos");
        myWay.setGenero("Pop tradicional");
        myWay.setDuracao(4);
        myWay.reproduzir(149000000);
        myWay.curtir(1300000);


        ExibidorDeInformacoes exibidorDeInformacoes = new ExibidorDeInformacoes();
        exibidorDeInformacoes.printDeInformacoes(hipsters);
        exibidorDeInformacoes.printDeInformacoes(myWay);
    }
}
