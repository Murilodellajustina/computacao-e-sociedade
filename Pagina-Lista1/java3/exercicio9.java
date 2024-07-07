import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    float valorcompra;
    float valorpago;
    float troco;
    int nota100;
    int nota10;
    int nota1;
        System.out.println("Insira o valo da compra");
        valorcompra=entrada.nextFloat();
        System.out.println("Insira o valor pago");
        valorpago=entrada.nextFloat();
        troco=valorpago-valorcompra;
        nota100=(int) (troco/100);
        troco%=100;
        nota10=(int) (troco/10);
        troco%=10;
        nota1=(int) troco;
        System.out.println("O valor do troco é: "+(valorpago-valorcompra));
        System.out.println("Quantidade de notas 100: "+nota100);
        System.out.println("Quantidade de notas 10: "+nota10);
        System.out.println("Quantidade de notas 1: "+nota1);
    }
    
}