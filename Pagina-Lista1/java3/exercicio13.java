import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada=new Scanner(System.in);
    int a;
    int b;
    int c;
        System.out.println("Insira o numero A: ");
        a=entrada.nextInt();
        System.out.println("Insira o numero B: ");
        b=entrada.nextInt();
        System.out.println("Insira o numero C: ");
        c=entrada.nextInt();
    if (a+b>c)
            System.out.println("A soma e maior que C");
    else if (a+b==c)
            System.out.println("A soma e igual a C");
    else
            System.out.println("A soma e menor que C");
    }
    
}