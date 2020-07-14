package exerciciosAula13Operadores;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num = dados.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = dados.nextInt();

        System.out.println("A somatória desses dois números é: " + (num + num2));

    }

}