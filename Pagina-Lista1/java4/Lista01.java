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
public class Lista01 {

    public static void main(String Args[]) {
        Scanner scanner = new Scanner(System.in);

        float preço = scanner.nextFloat();
        System.out.print("preço do quilowatts:");
        
        float gastos = scanner.nextFloat();
        System.out.print("quntidades de quilowatts gastas na residencia:");
        
        float total=preço*gastos;
        
        float atraso=total*0.10f;
        
        System.out.println("Conta:"+total);
        System.out.println("conta em atraso:"+atraso);
        
        if(total>70)
            System.out.println("consumo de energia elevado");
        else
            System.out.println("Você e um consumidor consiente");
        
    }

}
