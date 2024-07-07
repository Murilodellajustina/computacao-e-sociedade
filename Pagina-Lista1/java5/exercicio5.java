package lista.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author MURILO
 */
public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double altura, maiorAltura = 0, somaAlturaMulheres = 0, somaAlturaTurma = 0;
        int codigo, contadorMulheres = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a altura da pessoa " + i + ": ");
            altura = entrada.nextDouble();
            System.out.print("Digite o código do sexo (1 para masculino, 2 para feminino): ");
            codigo = entrada.nextInt();
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (codigo == 2) {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            }
            somaAlturaTurma += altura;
        }
        double mediaAlturaMulheres = 0;
        if (contadorMulheres > 0) {
            mediaAlturaMulheres = somaAlturaMulheres / contadorMulheres;
            System.out.println("A média de altura das mulheres é: " + mediaAlturaMulheres);
        } else {
            System.out.println("Não há mulheres na turma.");
        }
        double mediaAlturaTurma = somaAlturaTurma / 10;
        System.out.println("A maior altura da turma é: " + maiorAltura);
        System.out.println("A média de altura da turma é: " + mediaAlturaTurma);
    }
}