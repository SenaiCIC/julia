
package aula5;

import java.util.Scanner;


public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int x = sc.nextInt();
        System.out.println("Você digitou o numero:"+x);
        
        
        sc.close();
       
    }
    
}
