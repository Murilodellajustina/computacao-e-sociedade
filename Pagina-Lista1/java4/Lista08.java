/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista4;

import java.util.Scanner;

public class Lista08{
public static void main(String args[])  {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite sua categoria:");
        char categoria = scanner.next().charAt(0);
        
        System.out.println("Digite seu salário atual:");
        double salario = scanner.nextDouble();
        
        double novoSalario = calcularAumento(categoria, salario);
        
        System.out.println("\nNome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Novo salário após aumento: " + novoSalario);
    }

    public static double calcularAumento(char categoria, double salario) {
        double aumento;

aumento = switch (categoria) {
        case 'A','a', 'H','h' -> 0.10;
        case 'B','b', 'D','d', 'E','e' -> 0.15;
        case 'C','c', 'F','f' -> 0.25;
        default -> 0.30;
    }; 
        return salario * (1 + aumento);
    }
}
