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
public class Lista16 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("Digite a abscissa do ponto:");
        double x = scanner.nextDouble();

        System.out.println("Digite a ordenada do ponto:");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("O ponto está no Quadrante 1.");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no Quadrante 2.");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no Quadrante 3.");
        } else if (x > 0 && y < 0) {
            System.out.println("O ponto está no Quadrante 4.");
        } else {
            System.out.println("O ponto está na origem.");
        }
    }
}
