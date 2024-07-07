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
public class Lista12 {
     public static void main(String args[]){
         Scanner scanner=new Scanner(System.in);
         
         System.out.println("Digite o valor angulo:");
         double valor=scanner.nextDouble();
         
         String tipoAngulo="";
         if(valor<90){
             tipoAngulo="agudo";
         }
         else if
                 (valor==90){
         tipoAngulo="reto";
         }
         else{
             tipoAngulo="obtuso";
     }
     
          System.out.println("O tipo de Angulo é:"+tipoAngulo);
         
         
         
}
     
}
