package br.com.projetoestevam.classesprincipais;

public class Podcast extends Audio implements Participantes{
    private int totalClassificacoes;
    private double classificacoes;
    private String participantes;
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public double getClassificacoes() {
        return classificacoes;
    }
    public int getTotalClassificacoes(){
        return totalClassificacoes;
    }

    public void darUmaNota (double nota, int totalClassificacoes) {
        classificacoes += nota;
        classificacoes *= totalClassificacoes;
        this.totalClassificacoes += totalClassificacoes;
    }

    public double mediaClassificacoes () {
        classificacoes /= totalClassificacoes;
        return classificacoes;
    }

    @Override
    public void printDasInformacoes() {
        System.out.println("O nome do Podcast escolhido é " + getTitulo());
        System.out.println("O host desse episódio é " + getHost() + ". Os participantes desse episódio são: " + participantes);
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Descrição: " + descricao);
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("A duração desse Podcast é de " + getDuracao() + " minutos!");
        System.out.println("A quantidade de visualizações para com esse Podcast é de " + getTotalDeReproducoes());
        System.out.println("A nota desse Podcast é de " + mediaClassificacoes() + ", com o total de pessoas votando de " + totalClassificacoes + "\n");
        if(mediaClassificacoes() >= 4){
            System.out.println("Esse Podcast é favorito pelos internautas!!");
        } else if (mediaClassificacoes() >= 2) {
            System.out.println("Podcast muito bom mesmo, recomendado");
        } else {
            System.out.println("Adicione esse Podcast em sua lista de 'Escutar Depois'");
        }
    }
}

