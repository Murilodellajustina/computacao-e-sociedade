package aula.ead;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio11 {
    public static void main(String[] args) {
        int segundos;
        int horas;
        int minutos;
        int segundos2;
        System.out.println("Insira quantos segundos tem o video: ");
        Scanner entrada=new Scanner(System.in);
        segundos=entrada.nextInt();
        horas=segundos/3600;
        minutos=(segundos%3600)/60;
        segundos2=segundos%60;
        System.out.println("O video tem duracao de: "+horas+ "h" +minutos+ "m" +segundos2+ "s");
    } 
    
}