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
public class Lista11 {
     public static void main(String args[]){
           Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a hora (0 a 23): ");
        int hora = scanner.nextInt();

        System.out.print("Informe o minuto (0 a 59): ");
        int minuto = scanner.nextInt();

        System.out.print("Informe o segundo (0 a 59): ");
        int segundo = scanner.nextInt();

       
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            System.out.println("Horário inválido!");
            return;
        }

        
        segundo++;
        
       
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        
        System.out.printf("\nHorário acrescido de 1 segundo:", hora, minuto, segundo);

        
    }
}
     

       
        
    