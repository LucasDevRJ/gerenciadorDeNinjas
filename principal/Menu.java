package principal;

import java.util.Scanner;

public class Menu {
    Ninja[] ninjas = new Ninja[10];
    int[] indiceNinjas = new int[10];
    Uchiha[] uchihas = new Uchiha[10];
    int[] indiceUchihas = new int[10];
    int indiceNinja = 0;
    int indiceUchiha = 0;

    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("----------|MENU PRINCIPAL|----------");
            System.out.println("1 - Adicionar Ninja.");
            System.out.println("2 - Adicionar Uchiha");
            System.out.println("3 - Exibir informações de todos os Ninjas.");
            System.out.println("4 - Exibir informações de todos os Uchihas.");
            System.out.println("5 - Atualizar habilidades especiais");
            System.out.println("6 - Sair.");
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

                case 4:
                    exibirInformacoesDosUchihas();
                    break;

                case 5:
                    atualizarHabilidadeEspecial(entrada);
                    break;

                case 6:
                    finalizarPrograma();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }

    public void adicionarNinja(Scanner entrada) {
        Ninja ninja = new Ninja();

        preencheInformacoesDoNinja(entrada, ninja);

        ninjas[indiceNinja] = ninja;
        indiceNinjas[indiceNinja] = indiceNinja;
        indiceNinja++;

        System.out.println("O Ninja " + ninja.nome + " foi cadastrado com sucesso.");
    }

    public void adicionarUchiha(Scanner entrada) {
        Uchiha uchiha = new Uchiha();

        preencheInformacoesDoNinja(entrada, uchiha);

        System.out.print("Digite a habilidade especial: ");
        uchiha.habilidadeEspecial = entrada.nextLine();

        while (uchiha.habilidadeEspecial == "") {
            System.out.println("Digite a habilidade especial!");
            System.out.print("Digite a habilidade especial: ");
            uchiha.habilidadeEspecial = entrada.nextLine();
        }

        uchihas[indiceUchiha] = uchiha;
        indiceUchihas[indiceUchiha] = indiceUchiha;
        indiceUchiha++;
        System.out.println("O Uchiha " + uchiha.nome + " foi adicionado com sucesso.");
        uchiha.mostrarHabilidadeEspecial();
    }

    public void preencheInformacoesDoNinja(Scanner entrada, Ninja ninja) {
        entrada.nextLine();

        System.out.print("Digite o nome do ninja: ");
        ninja.nome = entrada.nextLine();

        while (ninja.nome == "") {
            System.out.println("Digite o nome do ninja!");
            System.out.print("Digite o nome do ninja: ");
            ninja.nome = entrada.nextLine();
        }

        System.out.print("Digite a idade do ninja: ");
        ninja.idade = entrada.nextInt();

        while (ninja.idade < 0) {
            System.out.println("Digite uma idade válida!");
            System.out.print("Digite a idade do ninja: ");
            ninja.idade = entrada.nextInt();
        }

        entrada.nextLine();

        System.out.print("Digite a missão do ninja: ");
        ninja.missao = entrada.nextLine();

        while (ninja.missao == "") {
            System.out.println("Digite a missão do ninja!");
            System.out.print("Digite a missão do ninja: ");
            ninja.missao = entrada.nextLine();
        }

        System.out.print("Digite o nível de dificuldade da missão: ");
        ninja.nivelDeDificuldade = entrada.nextLine();

        while (ninja.nivelDeDificuldade == "") {
            System.out.println("Digite o nível de dificuldade da missão!");
            System.out.print("Digite o nível de dificuldade da missão: ");
            ninja.nivelDeDificuldade = entrada.nextLine();
        }

        System.out.print("Digite o status da missão: ");
        ninja.statusDaMissao = entrada.nextLine();

        while (ninja.statusDaMissao == "") {
            System.out.println("Digite o status da missão!");
            System.out.print("Digite o status da missão: ");
            ninja.statusDaMissao = entrada.nextLine();
        }
    }

    public void exibirInformacoesDosNinjas() {
        if (indiceNinja > 0) {
            for (int i = 0; i < indiceNinja; i++) {
                ninjas[i].mostrarInformacoes();
                System.out.println();
            }
        } else {
            System.out.println("Não há ninjas cadastrados.");
        }
    }

    public void exibirInformacoesDosUchihas() {
        if (indiceUchiha > 0) {
            for (int i = 0; i < indiceUchiha; i++) {
                uchihas[i].mostrarInformacoes();
                System.out.println("Posição: " + indiceUchihas[i]);
                System.out.println();
            }
        } else {
            System.out.println("Não há Uchihas cadastrados.");
        }
    }

    public void atualizarHabilidadeEspecial(Scanner entrada) {
        if (indiceUchiha > 0) {
            System.out.print("Digite a posição do Uchiha que deseja atualizar a habilidade: ");
            int posicao = entrada.nextInt();
            entrada.nextLine();
            boolean posicaoInexistente = true;
            for (int i = 0; i < indiceUchiha; i++) {
                if (posicao == indiceUchihas[i]) {
                    System.out.print("Digite a habilidade especial: ");
                    uchihas[i].habilidadeEspecial = entrada.nextLine();
                    posicaoInexistente = false;
                }
            }
            if (posicaoInexistente) {
                System.out.println("Posição inválida!");
            }
        } else {
            System.out.println("Não há Uchihas cadastrados.");
        }
    }

    public void finalizarPrograma() {
        System.out.println("Programa finalizado.");
    }
}