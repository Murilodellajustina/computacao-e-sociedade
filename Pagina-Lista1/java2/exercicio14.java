package aula.ead;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio14 {
        public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        int sdodia;
        int sfaltam;
        System.out.println("Insira as horas: ");
        Scanner entrada=new Scanner(System.in);
        horas=entrada.nextInt();
        System.out.println("Insira os minutos: ");
        minutos=entrada.nextInt();
        System.out.println("Insira os segundos: ");
        segundos=entrada.nextInt();
        sdodia=(horas*3600)+(minutos/60)+segundos;
        sfaltam=86400-sdodia;
        System.out.println("Os segundos que faltam para acabar o dia sao: "+sfaltam);
    }
}