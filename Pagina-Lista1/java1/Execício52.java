package execício.pkg5.pkg2;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Execício52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        System.out.println("Digite um numero");
        Scanner entrada = new Scanner(System.in);
        numero=entrada.nextInt();
        System.out.println("o numero e:"+numero);
        System.out.println("O antecessor e:"+(numero-1));
        System.out.println("O sucessor e:"+(numero+1));
        
        
        // TODO code application logic here
    }
    
}
