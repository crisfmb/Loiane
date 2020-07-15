package exerciciosAula13Operadores;

import java.util.Scanner;

public class exercicio4 {
    // calculo de média de aluno usando o scanner
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int nota1 = dados.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = dados.nextInt();

        System.out.println("Digite a terceira nota: ");
        int nota3 = dados.nextInt();

        System.out.println("Digite a quarta nota: ");
        int nota4 = dados.nextInt();

        System.out.println("A sua média final é: " + (nota1 + nota2 + nota3 + nota4) / 4);

    }

}