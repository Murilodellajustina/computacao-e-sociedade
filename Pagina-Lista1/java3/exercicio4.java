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
     float peso;
     float altura;
     float altura2;
     float IMC;
     Scanner entrada=new Scanner(System.in);
     System.out.println("Insira seu peso:");
     peso=entrada.nextFloat();
     System.out.println("Insira sua altura");
     altura=entrada.nextFloat();
     altura2=altura*altura;
     IMC=peso/altura2;
        System.out.println("O seu IMC e:"+IMC);
        if (IMC>25)
            System.out.println("Esta acima do peso");
        else
            System.out.println("Nao esta acima do peso");
    }
    
}
