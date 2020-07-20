package exerciciosAula13Operadores;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class exercicio10 {
    // Faça um programa que peça a temperatura em graus Celcius, transforme e
    // mostre a temperatura em graus Farenheit

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.println("Entre e temperatura em graus celcius: ");
        double temperaturaCelcius = info.nextDouble();

        double conversaoFarenheit = (temperaturaCelcius * 9 / 5) + 32;

        System.out.println("O valor convertido para Farenheit é: " + conversaoFarenheit);
    }

}