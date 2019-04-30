

package aula9;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        System.out.println("Digite um numero");
        double ju = sc.nextDouble(  );
        while (ju>=0){
            double res= Math.sqrt(ju);
           System.out.printf("%.3f%n",res);
           System.out.println("digite outro numero");
           ju=sc.nextDouble( );
        }
        System.out.println("Numero negativo");
    }
}
