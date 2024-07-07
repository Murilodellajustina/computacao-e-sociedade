package lista.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int cachorro=4;
     int X=6;
     float Bauru=6.5f;
     int Refri=2;
     int codigo;
     int quantidade;
     float total=0;
     Scanner entrada=new Scanner(System.in);     
        System.out.println("----------------------------------");
        System.out.println("| ESPECIFICAÇÃO:    |CODIGO|PREÇO|");
        System.out.println("|-------------------|------------|");
        System.out.println("|Cachorro quente    |  100 |4,00 |");
        System.out.println("|-------------------|------------|") ;       
        System.out.println("|X salada           |  101 |6,00 |");
        System.out.println("|-------------------|------------|") ;        
        System.out.println("|Bauru com ovo      |  102 |6,50 |");
        System.out.println("|-------------------|------------|") ;        
        System.out.println("|Refrigerante       |  103 |2,00 |");
        System.out.println("----------------------------------");
         System.out.println("Quantos pedidos você deseja fazer?");
        int numPedidos = entrada.nextInt();
         for (int i = 0; i < numPedidos; i++) {
        System.out.println("Faça seu pedido pelo codigo: ");
        codigo=entrada.nextInt();
        System.out.println("Insira a quantidade: ");
        quantidade=entrada.nextInt();
       switch (codigo) {
                case 100 -> total += cachorro * quantidade;
                case 101 -> total += X * quantidade;
                case 102 -> total += Bauru * quantidade;
                case 103 -> total += Refri * quantidade;
                default -> System.out.println("Código de pedido inválido.");
         }
        System.out.println("O valor total dos pedidos é: " + total);
         }
        
        
    }
    
}