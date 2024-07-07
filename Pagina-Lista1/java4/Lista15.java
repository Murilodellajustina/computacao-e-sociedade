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
public class Lista15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite a idade do nadador:");
        int idade=scanner.nextInt();
        
       
        
        if(idade>5 && idade <10){
            System.out.println("categoria infantil");
        }else if(idade>=11 && idade<=17){
            System.out.println("categoria juvenil");
        } else if(idade>=18 && idade<=60){
            System.out.println("categoria adulto");
        }else if(idade>60){
            System.out.println("categoria senior");
        }else {
            System.out.println("idade invalida");
    
            
    }
  }
}