public class Principal {
    public static void main(String[] args) {

        Filme filme001 = new Filme();
        filme001.nome = "Poderoso Chefão";
        filme001.anoDeLancamento = 1970;
        filme001.duracaoEmMinutos = 180;

        filme001.exibeFichaTecnica();
        filme001.avalia(8);
        filme001.avalia(5);
        filme001.avalia(10);

        System.out.println(filme001.somaAvaliacoes);
        System.out.println(filme001.totalDeAvaliacao);
        System.out.println(filme001.pegaMedia());

    }
}