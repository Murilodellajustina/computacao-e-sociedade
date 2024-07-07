public class Exercicio9 {
    public static void main(String[] args) {
    float Ccafe;
    float Cleite;
    float Cbolacha;
    int Qcafe;
    int LLeite;
    int BBolacha;
    float Gcafe;
    float Gleite;
    float Gbolacha;
    System.out.println("Insira a quantidade de cafe comprada");
     Scanner entrada=new Scanner(System.in);
     Qcafe=entrada.nextInt();
      System.out.println("Insira o valor do cafe");
      Ccafe=entrada.nextFloat();
     Gcafe=Qcafe*Ccafe;
     System.out.println("Insira a quantidade de leite comprada");
     LLeite=entrada.nextInt();
     System.out.println("Insira o valor do leite");
     Cleite=entrada.nextFloat();
     Gleite=LLeite*Cleite;
     System.out.println("Insira a quantidade de bolacha comprada");
     BBolacha=entrada.nextInt();
     System.out.println("Insira o valor do cafe");
     Cbolacha=entrada.nextFloat();
     Gbolacha=BBolacha*Cbolacha;
     System.out.println("O valor gasto com cafe foi:"+Gcafe);
     System.out.println("O valor gasto com leite foi:"+Gleite);
     System.out.println("O valor gasto com bolacha foi:"+Gbolacha);
     System.out.println("O valor total gasto foi:R$ "+(Gcafe+Gleite+Gbolacha));
    }
}