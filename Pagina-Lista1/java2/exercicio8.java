package aula.ead;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio8 {
    public static void main(String[] args) {        
    
    double salm;
    double salm2;
    int carrov;
    double valorv;
    double comcv;
    double comvcv;
    System.out.println("Insira o valor do salario minimo");
     Scanner entrada=new Scanner(System.in);
     salm=entrada.nextDouble();
     salm2=salm*2;
     System.out.println("Insira a quantidade de carros vendidos");
    carrov=entrada.nextInt();
    comcv=carrov*150;
    System.out.println("Insira o valor total dos carros vendidos");
    valorv=entrada.nextDouble();
    comvcv=valorv*0.05;
    System.out.println("O salario recebido sem comissoes e:"+salm2);
    System.out.println("A comissao por carros vendidos e:"+comcv);
    System.out.println("A comissao do valor de vendas e:"+comvcv);
    System.out.println("O salario recebido foi:"+(comcv+salm2+comcv));
    }
    
}