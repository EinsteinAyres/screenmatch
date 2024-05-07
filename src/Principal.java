import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme filme001 = new Filme();
        filme001.setNome("Poderoso Chefão");
        filme001.setAnoDeLancamento(1970);
        filme001.setDuracaoEmMinutos(180);

        filme001.exibeFichaTecnica();
        filme001.avalia(8);
        filme001.avalia(5);
        filme001.avalia(10);

        Serie serie001 = new Serie();
        serie001.setNome("Spartacus");
        serie001.setAnoDeLancamento(2016);
        serie001.setMinutosPorEpisodio(50);

        System.out.println(filme001.getSomaAvaliacoes());
        System.out.println(filme001.getTotalDeAvaliacao());
        System.out.println(filme001.pegaMedia());



        CalculadoraDeTempo caluladora = new CalculadoraDeTempo();
        caluladora.inclui(filme001);
        System.out.println(caluladora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme001);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie001);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}