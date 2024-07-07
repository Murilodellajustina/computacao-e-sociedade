package lista.pkg2;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    double valorg;
    double distancia;
    double kmporl;
    double litros;
        System.out.println("Insira a distancia do percurso:");
        distancia=entrada.nextDouble();
        System.out.println("Insira o consumo medio do seu carro em km/litro:");
        kmporl=entrada.nextDouble();
        System.out.println("Insira o valor por litro da gasolina:");
        valorg=entrada.nextDouble();
        litros=distancia/kmporl;
        System.out.println("O valor a ser gasto com combustivel será: "+litros*valorg);
    }
    
}