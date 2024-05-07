package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliados no momento");
        } else {
            System.out.println("Adicione na sua lista para assistir depois");
        }
    }
}
