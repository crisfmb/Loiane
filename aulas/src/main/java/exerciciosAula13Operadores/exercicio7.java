package exerciciosAula13Operadores;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        // Esse aqui calcula a area de um quadrado e mostra o dobro p usuario

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do quadrado: ");
        double areaUm = dados.nextDouble();

        System.out.println("Digite o segundo lado do quadrado: ");
        double areaDois = dados.nextDouble();

        double areaQuadrado = (areaUm * areaDois) * 2;

        System.out.println("A área desse quadrado ao dobro é: " + areaQuadrado);

    }

}