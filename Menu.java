import java.util.Scanner;

public class Menu {
    Ninja[] ninjas = new Ninja[10];
    int indice = 0;
    public void exibirMenuPrincipal() {
        System.out.println("----------|MENU PRINCIPAL|----------");
        System.out.println("1 - Adicionar ninja.");
        System.out.println("2 - Exibir informações de todos os ninjas.");
        System.out.println("3 - Atualizar habilidades especiais.");
        System.out.println("------------------------------------");
        System.out.print("Digite a opção desejada: ");

        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                adicionarNinja(entrada);
                break;
        }
    }

    public void adicionarNinja(Scanner entrada) {
        Ninja ninja = new Ninja();

        System.out.print("Digite o nome do ninja: ");
        ninja.nome = entrada.nextLine();

        System.out.print("Digite a idade do ninja: ");
        ninja.idade = entrada.nextInt();

        System.out.print("Digite a missão do ninja: ");
        ninja.missao = entrada.nextLine();

        System.out.print("Digite o nível de dificuldade da missão: ");
        ninja.nivelDeDificuldade = entrada.nextLine();

        System.out.print("Digite o status da missão: ");
        ninja.statusDaMissao = entrada.nextLine();

        ninjas[indice] = ninja;
        indice++;
    }
}