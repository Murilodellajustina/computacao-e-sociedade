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
public class Lista09 {
    public static void main(String args[])  {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Informe o número da conta bancária: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Informe o saldo atual da conta bancária: ");
        double saldoAtual = scanner.nextDouble();

        System.out.print("Informe o tipo de operação a ser realizada (1 - depósito ou 2 - saque): ");
        int tipoOperacao = scanner.nextInt();

        System.out.print("Informe o valor da operação: ");
        double valorOperacao = scanner.nextDouble();

        
        if (numeroConta!=033322554.00000 && tipoOperacao == 1) { // Depósito
            saldoAtual += valorOperacao;
        } else if (tipoOperacao == 2) { // Saque
            saldoAtual -= valorOperacao;
            
            if (saldoAtual < 0) {
                System.out.println("Conta estourada!");
            }
        } else {
            System.out.println("Tipo de operação inválido!");
            return;
        }

        
        System.out.println("Novo saldo: " + saldoAtual);

      
    }
}

        
    