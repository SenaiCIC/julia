
package aula8;

import java.util.Scanner;

public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("digite seu nome");
        String nome = sc.next ();
        System.out.println("Digite o valor do depósito");
        float dep = sc.nextFloat();
        
        System.out.println("------menu------");
        System.out.println("1- novo depósito");
        System.out.println("2- saque");
        System.out.println("3- saldo");
         int menu = sc.nextInt();
         if (menu == 1){
             System.out.println("qual o valor do seu novo desposito?");
             double resp1 = sc.nextDouble();
             double resp2 = resp1+dep;
             System.out.println(resp2);
         }
         
         
         
        
       
    }
       
}
