/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista4;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Lista02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da prova 1:");
        float p1 = scanner.nextFloat();

        System.out.print("Digite a nota da prova 2:");
        float p2 = scanner.nextFloat();

        System.out.print("Digite a nota do trabalho:");
        float tb = scanner.nextFloat();

        if ((p1 >= 6 || p2 >= 6) && tb >= 7) {
            System.out.println("parabens você foi aprovado");
        } else {
            System.out.println("infelismente você não foi aprovado");
        }

    }
}
