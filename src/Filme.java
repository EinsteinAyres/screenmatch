public class Filme {

    String nome;
    String diretor;
    String genero;
    int anoDeLancamento;
    int totalDeAvaliacao;
    int estrelas;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacao;
    }

}
