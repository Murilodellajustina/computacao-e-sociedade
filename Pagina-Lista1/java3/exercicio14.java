package Pagina-Lista1.java3;
package lista.pkg2;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    String nome;
    float portugues;
    float matematica;
    float conhecimentosg;
    float media;
        System.out.println("Insira o nome do candidato:");
        nome=entrada.nextLine();
        System.out.println("Insira a nota em matematica:");
        matematica=entrada.nextFloat();
        System.out.println("Insira a nota em portugues:");
        portugues=entrada.nextFloat();
        System.out.println("Insira a nota em Conhecimentos gerais");
        conhecimentosg=entrada.nextFloat();
        media=(matematica+portugues+conhecimentosg)/3;
        System.out.println("O nome do candidato e: "+nome);
        System.out.println("A nota em matematica e: "+matematica);
        System.out.println("A nota em portugues e: "+portugues);
        System.out.println("A nota em conhecimentos gerais e: "+conhecimentosg);
        System.out.println("A media do candidato foi: "+media);
        if (media>7&&(matematica>5)&(portugues>5)&(conhecimentosg>5))
            System.out.println("O candidato esta aprovado");
        else
            System.out.println("O aluno esta reprovado");
    }
    
}