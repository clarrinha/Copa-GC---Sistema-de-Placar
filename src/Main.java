import service.Cup;
import util.InitialLoad;

import java.util.Scanner;

void main() {

    Cup cup = new Cup();
    InitialLoad.load(cup);

    Scanner scanner = new Scanner(System.in);
    int option;

    do {

        System.out.println("\n=== Copa GC — Menu Principal ===");
        System.out.println("1. Listar seleções por grupo"); // feito
        System.out.println("2. Registrar resultado de partida");
        System.out.println("3. Exibir classificação do grupo");
        System.out.println("4. Listar artilheiros");
        System.out.println("0. Sair");
        System.out.print("Escolha: ");

        option = scanner.nextInt();

        switch (option) {

            case 1:
                cup.callGroup();
                break;

            case 2:
                cup.registerNewMatchInteractive();
                break;

            case 3:
                cup.calculateTheStandings();
                break;

            case 4:
                cup.addTopscore();;
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida");
        }

    } while (option != 0);

    scanner.close();
}