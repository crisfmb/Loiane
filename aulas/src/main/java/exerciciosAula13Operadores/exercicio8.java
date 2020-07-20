package exerciciosAula13Operadores;

import java.util.Scanner;

public class exercicio8 {
    // Pergunta quantos que você ganha por hora e o numero de horas trabalhadas no
    // mes. calcule e mostre o total do seu salario no referido mes

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Quantos você ganha por hora? ");
        double salarioPorHora = dados.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        double horasdeTrabalho = dados.nextDouble();

        double totalSalarioMes = salarioPorHora * horasdeTrabalho;

        System.out.println("O total do seu salário é: " + totalSalarioMes);

    }
}