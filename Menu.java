import java.util.Objects;
import java.util.Scanner;

public class Menu {
    Ninja[] ninjas = new Ninja[10];
    int indice = 0;

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenuPrincipal();
    }
    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("----------|MENU PRINCIPAL|----------");
            System.out.println("1 - Adicionar Ninja.");
            System.out.println("2 - Adicionar Uchiha");
            System.out.println("3 - Exibir informações de todos os Ninjas.");
            System.out.println("3 - Atualizar habilidades especiais.");
            System.out.println("4 - Sair.");
            System.out.println("------------------------------------");
            System.out.print("Digite a opção desejada: ");

            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    adicionarNinja(entrada);
                    break;

                case 2:
                    adicionarUchiha(entrada);
                    break;

                case 3:
                    exibirInformacoesDosNinjas();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }

    public void adicionarNinja(Scanner entrada) {
        Ninja ninja = new Ninja();

        preencheInformacoesDoNinja(entrada, ninja);

        ninjas[indice] = ninja;
        indice++;

        System.out.println("O Ninja " + ninja.nome + " foi cadastrado com sucesso.");
    }

    public void adicionarUchiha(Scanner entrada) {
        Uchiha uchiha = new Uchiha();

        preencheInformacoesDoNinja(entrada, uchiha);

        System.out.print("Digite a habilidade especial: ");
        uchiha.habilidadeEspecial = entrada.nextLine();

        ninjas[indice] = uchiha;
        indice++;

        System.out.println("O Uchiha " + uchiha.nome + " foi adicionado com sucesso.");
    }

    public void preencheInformacoesDoNinja(Scanner entrada, Ninja ninja) {
        entrada.nextLine();

        System.out.print("Digite o nome do ninja: ");
        ninja.nome = entrada.nextLine();

        System.out.print("Digite a idade do ninja: ");
        ninja.idade = entrada.nextInt();

        entrada.nextLine();
        System.out.print("Digite a missão do ninja: ");
        ninja.missao = entrada.nextLine();

        System.out.print("Digite o nível de dificuldade da missão: ");
        ninja.nivelDeDificuldade = entrada.nextLine();

        System.out.print("Digite o status da missão: ");
        ninja.statusDaMissao = entrada.nextLine();
    }

    public void exibirInformacoesDosNinjas() {
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                ninjas[i].mostrarInformacoes();
                System.out.println();
            }
        }
    }
}