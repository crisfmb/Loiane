package exerciciosAula13Operadores;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        // Esse aqui é pra converter metros para centimetros

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o valor em Metros: ");
        double valorMetros = dados.nextDouble();

        double calculo = valorMetros * 100;

        System.out.println("O valor de Metros para centimetros é: " + calculo);

    }
}