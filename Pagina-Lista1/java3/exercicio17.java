package lista.pkg2;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int parcelas;
    int parcelasP;
    double valorparcelas;
    double valorpago;
   double valortotal;
    Scanner entrada=new Scanner(System.in);
        System.out.println("Insira a quantidade de parcelas");
        parcelas=entrada.nextInt();
        System.out.println("Insira a quantidade de parcelas pagas");
        parcelasP=entrada.nextInt();
        System.out.println("Insira o valor da parcela");
        valorparcelas=entrada.nextDouble();
        valorpago= valorparcelas*parcelasP;
        valortotal=(parcelas*valorparcelas)-valorpago;
        System.out.println("O valor já pago foi: R$"+valorpago);
        System.out.println("O valor que falta pagar é: R$"+valortotal);
        
        
        
        
    
    }
    
}