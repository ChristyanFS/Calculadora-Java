import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Entrada de dados, nomeado como: input
        Scanner input = new Scanner(System.in);
        // Variáveis
        int opcao;
        double n1, n2;
        char esc;

        while (true) {
            //Painel de escolha.
            System.out.print(" 1 - Somar \n");
            System.out.print(" 2 - Subtrair \n");
            System.out.print(" 3 - Multiplicar \n");
            System.out.print(" 4 - Dividir \n");
            System.out.print(" 5 - Sair \n");
            System.out.print("Escolha uma das opcoes acima: ");
            opcao = input.nextInt();

            if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            }

            //Recebendo valores:
            System.out.print("Digite o 1º numero: ");
            n1 = input.nextDouble();
            System.out.print("Digite o 2º numero: ");
            n2 = input.nextDouble();

            //Estrutura Escolha.
            switch (opcao) {
                case 1:
                    System.out.printf("%.0f + %.0f = %.0f", n1, n2, n1 + n2);
                    break;
                case 2:
                    System.out.printf("%.0f - %.0f = %.0f", n1, n2, n1 - n2);
                    break;
                case 3:
                    System.out.printf("%.0f * %.0f = %.0f", n1, n2, n1 * n2);
                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.printf("%.0f / %.0f = %.0f", n1, n2, n1 / n2);
                    } else {
                        System.out.print("Não é possível dividir por 0");
                    }
                    break;

                default: //Se o usuário digitar qualquer outro valor além de 1 a 5, será considerado essa mensagem.
                    System.out.print("Opção Invalida");
            }

            // Verificando se o usuário quer continuar.
            System.out.print("\nDeseja continuar? [S/N] ");
            esc = input.next().charAt(0); // Pega apenas o primeiro índice digitado pelo usuário, em Java se começa pelo índice 0
            if ((esc == 'N') || (esc == 'n')) { // Verifica se o usuário digitou N ou n. Se for um dos dois é executado.
                System.out.println("Saindo...");
                break; // Da fim ao loop
            }
        }
    }
}