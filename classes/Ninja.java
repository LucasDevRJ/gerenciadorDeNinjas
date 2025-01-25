package classes;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;

    public void mostrarInformacoes() {
        System.out.println("Informações do classes.Ninja");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível de Dificuldade: " + nivelDeDificuldade);
        System.out.println("Status da Missão: " + statusDaMissao);
    }
}
