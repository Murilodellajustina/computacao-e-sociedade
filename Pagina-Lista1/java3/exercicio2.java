public class Exercicio2 {


    public static void main(String[] args) {
       float valorq;
       int quilowattg;
       float valorapagar;
       float valoratraso;
       
       System.out.println("Insira o valor do quilowatt");
       Scanner entrada=new Scanner(System.in);
       valorq=entrada.nextFloat();
       System.out.println("Insira a quantidade de quilowatt gasto");
       quilowattg=entrada.nextInt();
       valorapagar=valorq*quilowattg;
       valoratraso=valorapagar*1.10f;
       System.out.println("O valor a pagar sem atraso e:"+valorapagar);
       System.out.println("O valor a pagar com atraso e:"+valoratraso);
    }
    
}