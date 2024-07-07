package aula.ead;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio6 {
        public static void main(String[] args) {

         int Temperatura;
         System.out.println("Insira a temperatura em Cº");
         Scanner entrada=new Scanner(System.in);
         Temperatura=entrada.nextInt();
        int Produto = Temperatura*9;
        int Soma = Produto+160;
        System.out.println("A temperatura de "+Temperatura+"Cº em Fahreinheit e:"+Soma/5+"Fº");
    }
    
}

