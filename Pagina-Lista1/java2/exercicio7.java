public class Exercicio7 {
    public static void main(String[] args) {
    float T1;
    float T2;
    float T3;
    T1=(float) (1.50);
    T2=(float) (2.00);
    T3=(float) (0.75);
    int Q1;
    int Q2;
    int Q3;
    float valor1;
    float valor2;
    float valor3;
    System.out.println("Insira a quantidade vendida do tipo 1");
     Scanner entrada=new Scanner(System.in);
     Q1=entrada.nextInt();
     valor1=Q1*T1;
     System.out.println("Insira a quantidade vendida do tipo 2");
     Q2=entrada.nextInt();
     valor2=Q2*T2;
     System.out.println("Insira a quantidade vendida do tipo 3");
     Q3=entrada.nextInt();
     valor3=Q3*T3;
     System.out.println("O valor arrecadado com as vendas do picole do tipo 1 foi:"+valor1);
     System.out.println("O valor arrecadado com as vendas do picole do tipo 2 foi:"+valor2);
     System.out.println("O valor arrecadado com as vendas do picole do tipo 3 foi:"+valor3);
     System.out.println("O valor total arrecadado foi:"+(valor1+valor2+valor3));
    }
}