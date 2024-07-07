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
public class Lista05 {
      public static void main(String args[]){
        Scanner scanner=new Scanner (System.in);
        
         System.out.print("digite um numero inteiro:");
         int numero=scanner.nextInt();
         
         if(numero<=10)
              System.out.println("F1");
         else if
                 (numero>10 && numero<=100)
              System.out.println("F2");
         else if
                 (numero>100)
              System.out.println("F3");
                 
         
      }
}
