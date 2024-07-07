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
public class Lista18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite seu saldo mediu do ultimo ano:");
        double saldo=scanner.nextDouble();
        
        double credito = 0;
        if(saldo>=0 && saldo<=500){
        System.out.println("nenhum credito disponivel");
        }else if(saldo>=500.01 && saldo<=1000){
           credito=saldo*0.30;
        }else if(saldo>=1000.01 && saldo<=3000)
            credito=saldo*0.40;
        else if(saldo>3000)
            credito=saldo*0.50;
        
        System.out.println("seu credito e de:"+credito);
}
    }
