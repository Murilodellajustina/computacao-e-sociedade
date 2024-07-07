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
public class Lista06 {
     public static void main(String args[]){
        Scanner input=new Scanner (System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();
        
        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = input.nextInt();
        
      
        int menor;
        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        
        System.out.println("O menor número é: " + menor);
        
        
    
     }
}
