package menu;

import java.util.Scanner;

public class Menu {
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
                adicionarNinja();
                break;
        }
    }

    public void adicionarNinja() {

    }
}