public class Exercicio10 {
    public static void main(String[] args) {
        int numero;
        System.out.print("Digite um numero inteiro: ");
         Scanner entrada=new Scanner(System.in);
        numero=entrada.nextInt();

        int quociente = numero / 2;
        int resto = numero % 2;
        System.out.println("O quociente da divisao por 2 e: " + quociente);
        System.out.println("O resto da divisao por 2 e: " + resto);
    }
}
