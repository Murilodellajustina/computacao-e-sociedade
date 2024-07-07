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
public class Lista07 {
   public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // Passo 1: Ler os números
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();
        
       
        int menor, medio, maior;
        if (num1 < num2 && num1 < num3) {
            menor = num1;
            if (num2 < num3) {
                medio = num2;
                maior = num3;
            } else {
                medio = num3;
                maior = num2;
            }
        } else if (num2 < num3) {
            menor = num2;
            if (num1 < num3) {
                medio = num1;
                maior = num3;
            } else {
                medio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 < num2) {
                medio = num1;
                maior = num2;
            } else {
                medio = num2;
                maior = num1;
            }
        }

       
        System.out.println("Os números em ordem crescente são: " + menor + ", " + medio + ", " + maior);
        
        
    }
}
        
    }

