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
public class Lista04 {
     public static void main(String args[]){
        Scanner scanner=new Scanner (System.in);
        
         System.out.println("digite um numero:");
         float numero=scanner.nextFloat();
         
         if(numero%2==0)
             System.out.println("par");
         else 
             System.out.println("impar");
        
     }
}
