package aula.ead;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio5 {
    public static void main(String[] args) {
    int base;
    int altura;
    int area;
    int perimetro;
    System.out.println("Insira a base do retangulo");
    Scanner entrada=new Scanner(System.in);
    base=entrada.nextInt();
    System.out.println("Insira a altura do retangulo");
    altura=entrada.nextInt();
    area=base*altura;
    perimetro=(base+altura)*2;
    System.out.println("A area do retangulo e:"+area);
    System.out.println("O perimetro do retangulo e:"+perimetro);
    }
    
    
}
