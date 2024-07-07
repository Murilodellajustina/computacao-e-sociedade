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
public class Lista13 {
  public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("nome do produto (1):");
        String nome1 = scanner.nextLine();
        
        System.out.println("digite a quantidade do produto (1):");
        int produto1 = scanner.nextInt();
        scanner.nextLine(); // Consumindo a nova linha pendente
        
        System.out.println("nome do produto(2):");
        String nome2 = scanner.nextLine();
        
        System.out.println("digite a quantidade do produto (2):");
        int produto2 = scanner.nextInt();
        scanner.nextLine(); // Consumindo a nova linha pendente
        
        System.out.println("nome do produto (3):");
        String nome3 = scanner.nextLine();
        
        System.out.println("digite a quantidade do produto(3):");
        int produto3 = scanner.nextInt();
        
        System.out.println("Produtos abaixo do estoque mínimo (30 unidades):");
        if (produto1 < 30) {
            System.out.println(nome1);
        }
        if (produto2 < 30) {
            System.out.println(nome2);
        }
        if (produto3 < 30) {
            System.out.println(nome3);
        }
    }
}