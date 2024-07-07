public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    double tamanhopista;
    int peso;
    int visibilidade;
    int chuva;
    int passageiros;
    int sistema;
        System.out.println("O aviao possui sistema de decolagem?(Se sim insira 1, se não insira 0)");
        sistema=entrada.nextInt();
        System.out.println("Insira o tamanho da pista:");
        tamanhopista=entrada.nextDouble();
        System.out.println("Insira o peso do aviao");
        peso=entrada.nextInt();
        System.out.println("Insira a vizibilidade");
        visibilidade=entrada.nextInt();
        System.out.println("Insira a intensidade da chuva em mm");
        chuva=entrada.nextInt();
        System.out.println("Insira a quantidade de passageiros");
        passageiros=entrada.nextInt();
        if (tamanhopista<1.5 && peso<40)
        System.out.println("O avião pode decolar");
        else if (tamanhopista >= 1.5 && tamanhopista <= 2 && peso <= 60)
            System.out.println("O aviao pode decolar");
        else if (tamanhopista>2)
            System.out.println("O aviao pode decolar");
        else if (visibilidade<20 && sistema==1)
            System.out.println("O aviao pode decolar");
        else if (chuva>5)
            System.out.println("O aviao nao pode decolar devido a chuva intensa");
        else if (passageiros >100&&chuva>0)
            System.out.println("O aviao nao pode decolar");
        else
            System.out.println("O aviao nao pode decolar");
    }
    
}
