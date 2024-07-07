package exercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int distancia;
        int volume;
        System.out.println("Insira a distancia percorrida");
        Scanner entrada= new Scanner (System.in);
        distancia=entrada.nextInt();        
        System.out.println("Insira o volume de combustivel consumido");
        volume=entrada.nextInt();
        System.out.println("O consumo medio foi:"+distancia/volume+"Km/l");
    }
    
}