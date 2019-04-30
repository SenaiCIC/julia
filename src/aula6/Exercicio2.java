
package aula6;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite seu nome:  ");
        String nome= sc.next ();
        System.out.println("Digite sua ideda: ");
        int idade = sc.nextInt();
        System.out.println("Digite seu peso:  ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura= sc.nextDouble();
        System.out.printf("Seu nome é %s, sua idade e %d, seu peso é"+"%3f%n e sua altura é %.3f%n", nome, idade, peso, altura);
        double res = peso / (altura*altura);
        
               
    }
  
}
