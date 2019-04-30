
package aula5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite o primeiro numero");
        int x = sc.nextInt();
        System.out.println("digite o segundo numero");
        int y = sc.nextInt();
        
        System.out.println("A soma é:"+ (x+y));
    }
    
}
