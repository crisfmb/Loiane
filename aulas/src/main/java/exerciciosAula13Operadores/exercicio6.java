package exerciciosAula13Operadores;

import java.util.Scanner;

public class exercicio6 {
    // Esta merda vai pedir o raio do circulo e calcular a area

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        System.out.println("Informe o raio do circulo: ");
        double raioCirculo = dados.nextDouble();

        double areaCirculo = 3.14159 * (raioCirculo * raioCirculo);

        System.out.println("A área desta merda é: " + areaCirculo);

    }

}