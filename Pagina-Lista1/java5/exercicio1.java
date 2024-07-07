package lista.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int X=0;
        int Y=1;
        while(Y!=X){
        System.out.println("Insira um número para x: ");
        X=entrada.nextInt();
        System.out.println("Insira um número para y: ");
        Y=entrada.nextInt();
     
        }
    }
    
}
