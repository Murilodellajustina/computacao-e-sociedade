package lista.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    int X=0;
        int Y=1;
        System.out.println("Insira um número para x: ");
        X=entrada.nextInt();
        System.out.println("Insira um número para y (que seja maior que X): ");
        Y=entrada.nextInt();
        while(Y<X){
           System.out.println("O segundo número deve ser maior que o primeiro.");
            System.out.print("Insira um número para y novamente: ");
                Y=entrada.nextInt(); 
        }
        
    }
    
}