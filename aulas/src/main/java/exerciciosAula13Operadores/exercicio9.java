package exerciciosAula13Operadores;

import java.util.Scanner;

public class exercicio9 {
    // Faça um programa que peça a temperatura em graus Farenheit, transforme e
    // mostre a temperatura em graus celsius
    // C = (5*(F-32)/9)

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Qual é a temperatura atual em Farenheit: ");
        double temperaturaFarenheit = dados.nextDouble();

        double conversaoCelcius = (temperaturaFarenheit - 32) * 5 / 9;

        System.out.println("Essa temperatura transformada em Celcius é: " + conversaoCelcius);
    }
}