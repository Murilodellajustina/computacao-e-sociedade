package aula.ead;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio13 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        int sdodia;
        System.out.println("Insira as horas: ");
        Scanner entrada=new Scanner(System.in);
        horas=entrada.nextInt();
        System.out.println("Insira os minutos: ");
        minutos=entrada.nextInt();
        System.out.println("Insira os segundos: ");
        segundos=entrada.nextInt();
        sdodia=(horas*3600)+(minutos/60)+segundos;
        System.out.println("Os segundos que ja passaram no dia sao: "+sdodia);
    }
}