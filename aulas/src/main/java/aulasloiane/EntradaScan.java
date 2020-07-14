package aulasloiane;

import java.util.Scanner;

public class EntradaScan {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        // sobre a classe scanner como utilizar
        /*
         * System.out.println("Digite seu nome completo: "); String nome =
         * dados.nextLine(); System.out.println("Seu nome completo é: " + nome);
         */

        /*
         * System.out.println("Digite seu primeiro nome: "); String primeiroNome =
         * dados.nextLine(); System.out.println("Seu primeiro nome é: " + primeiroNome);
         */
        System.out.println("Digite sua idade: ");
        int idade = dados.nextInt();

        System.out.println("Sua idade é: " + idade);

    }

}
