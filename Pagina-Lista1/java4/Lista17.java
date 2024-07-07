/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista4;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Lista17 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso na Terra (em kg):");
        double pesoTerra = scanner.nextDouble();

        System.out.println("Digite o código do planeta:");
        System.out.println("1. Mercúrio");
        System.out.println("2. Vênus");
        System.out.println("3. Marte");
        System.out.println("4. Júpiter");
        System.out.println("5. Saturno");
        System.out.println("6. Urano");
        System.out.println("7. Netuno");
        int codigoPlaneta = scanner.nextInt();

        double pesoPlaneta = calcularPesoPlaneta(pesoTerra, codigoPlaneta);

        if (pesoPlaneta != -1) {
            System.out.println("Seu peso no planeta escolhido é: " + pesoPlaneta + " kg");
        } else {
            System.out.println("Código de planeta inválido.");
        }
    }

    public static double calcularPesoPlaneta(double pesoTerra, int codigoPlaneta) {
        double pesoPlaneta = -1; // Valor inválido por padrão

        switch (codigoPlaneta) {
            case 1 -> // Mercúrio
                pesoPlaneta = pesoTerra * 0.37;
            case 2 -> // Vênus
                pesoPlaneta = pesoTerra * 0.88;
            case 3 -> // Marte
                pesoPlaneta = pesoTerra * 0.38;
            case 4 -> // Júpiter
                pesoPlaneta = pesoTerra * 2.64;
            case 5 -> // Saturno
                pesoPlaneta = pesoTerra * 1.15;
            case 6 -> // Urano
                pesoPlaneta = pesoTerra * 1.17;
            case 7 -> // Netuno
                pesoPlaneta = pesoTerra * 1.18;
        }

        return pesoPlaneta;
    }
}
    

