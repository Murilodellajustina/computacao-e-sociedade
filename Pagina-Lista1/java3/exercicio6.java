/**
 *
 * @author alunolages
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner entrada=new Scanner(System.in);
        int prova1;
        int prova2;
        int trabalho;
        int frequencia;
        System.out.println("Insira a nota da Prova 1");
        prova1=entrada.nextInt();
        System.out.println("Insira a nota da Prova 2");
        prova2=entrada.nextInt();
        System.out.println("Insira a nota do trabalho");
        trabalho=entrada.nextInt();
        System.out.println("Insira a freuquencia do aluno (em %)");
        frequencia=entrada.nextInt();
        if ((prova1>=6 || prova2>=6)&&trabalho>=7)
            System.out.println("O aluno esta aprovado");
        else if ((frequencia >=90)&&(trabalho==6))
            System.out.println("O aluno esta aprovado");
        else 
            System.out.println("O aluno esta reprovado");
    }
    
    
}