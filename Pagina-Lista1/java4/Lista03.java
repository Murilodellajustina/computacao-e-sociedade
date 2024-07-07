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
public class Lista03 {
    public static void main(String args[]){
        Scanner scanner=new Scanner (System.in);
        System.out.println("digite o peso em Kg:");
        float peso=scanner.nextFloat();
        
         System.out.println("digite a altuta Metros:");
        float altura=scanner.nextFloat();
        
        float quadrado=altura *altura;
        float imd=peso/quadrado;
        
        System.out.println("seu indice de massa corporal eh:"+imd);
        
        if(imd<=20)
            System.out.println(" magro");
        else if
                (imd>30)
            System.out.println("obeso");
        else if
                (imd>25 && imd<30)
                System.out.println("sobrepeso");
        else if
            (imd>20 && imd<24.99);
        System.out.println("normal");
        
        
    }
    
}
