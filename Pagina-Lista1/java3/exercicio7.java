public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float comprimento;
        float largura;
        float altura;
        float areapiso;
        float volume;
        float areaparedes;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Insira o comprimento da sala");
        comprimento=entrada.nextFloat();
        System.out.println("Insira a largura da sala");
        largura=entrada.nextFloat();
        System.out.println("Insira a altura da sala");
        altura=entrada.nextFloat();
        areapiso=comprimento*largura;
        volume=areapiso*altura;
        areaparedes= 2*(comprimento*altura+largura*altura);
        System.out.println("A area do piso e: "+areapiso);
        System.out.println("O volume da sala e: "+volume);
        System.out.println("A area das paredes e: "+areaparedes);
        if (volume<100)
            System.out.println("Deve ser instalado um ar condicionado pequeno");
        else if (volume>100&&volume<500)
            System.out.println("Deve ser instalado um ar condicionado medio");
        else 
            System.out.println("Deve ser instalado um ar condicionado grande");
    }
    
}