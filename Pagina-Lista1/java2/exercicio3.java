public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num1;
      int num2;
      int quad1;
      int quad2;
      System.out.println("insira o primeiro numero");
      Scanner entrada=new Scanner(System.in);
        num1=entrada.nextInt();
        System.out.println("Insira o segundo numero");
        num2=entrada.nextInt();
        quad1=num1*num1;
        quad2=num2*num2;
        System.out.println("O quadrado do primeiro numero e:"+quad1);
        System.out.println("O quadrado do segundo numero e:"+quad2);
        System.out.println("A soma dos quadrados e:"+(quad1+quad2));
    }
    
}

