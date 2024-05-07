import br.com.alura.scrrenmatch.modelos.Filme;

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

        System.out.println(filme001.getSomaAvaliacoes());
        System.out.println(filme001.getTotalDeAvaliacao());
        System.out.println(filme001.pegaMedia());

    }
}