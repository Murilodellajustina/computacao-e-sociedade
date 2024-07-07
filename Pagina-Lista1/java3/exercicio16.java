public class Exercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    float preço1dia1;
    float preço2dia1;
    float preço3dia1;
    float preço1dia2;
    float preço2dia2;
    float preço3dia2;
    float inflaçao1;
    float inflaçao2;
    float inflaçao3;
        System.out.println("Insira o preço da mercadoria 1 no dia 01/01/2022");
        preço1dia1=entrada.nextFloat();
        System.out.println("Insira o preço da mercadoria 2 no dia 01/01/2022");
        preço2dia1=entrada.nextFloat();
        System.out.println("Insira o preço da mercadoria 3 no dia 01/01/2022");
        preço3dia1=entrada.nextFloat();
        System.out.println("Insira o preço da mercadoria 1 no dia 01/02/2022");
        preço1dia2=entrada.nextFloat();
        System.out.println("Insira o preço da mercadoria 2 no dia 01/02/2022");
        preço2dia2=entrada.nextFloat();
        System.out.println("Insira o preço da mercadoria 3 no dia 01/02/2022");
        preço3dia2=entrada.nextFloat();
        inflaçao1=((preço1dia2-preço1dia1)/preço1dia1)*100;
        inflaçao2=((preço2dia2-preço2dia1)/preço2dia1)*100;
        inflaçao3=((preço3dia2-preço3dia1)/preço3dia1)*100;
        System.out.println("A inflação do primeiro produto foi: "+inflaçao1 +"%");
        System.out.println("A inflação do segundo produto foi: "+inflaçao2 +"%");
        System.out.println("A inflação do terceiro produto foi: "+inflaçao3 +"%");
    }
    
}