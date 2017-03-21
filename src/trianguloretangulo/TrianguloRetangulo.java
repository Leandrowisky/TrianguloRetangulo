
package trianguloretangulo;

import java.util.Scanner;

/*
Escreva um programa em Java que lê o tamanho dos dois catetos de um triângulo retângulo e que mostra o tamanho da hipotenusa.
 */
public class TrianguloRetangulo {

    public static void main(String[] args) {
        double c1, c2, h;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o Valor do Primeiro Cateto do Triangulo:");
        c1 = leitor.nextDouble();
        System.out.println("Insira o Valor do Segundo Cateto do Triangulo:");
        c2 = leitor.nextDouble();
        
        h = Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2));
        
        System.out.println("O Valor da sua hipotenusa é igual a "+ h);
    }
    
}
