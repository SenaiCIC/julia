
package aula7;

import java.util.Scanner;

public class CondicionalCase {
    public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);    
        System.out.println("Tecle um numero de 1 a 7");
        int dia = sc.nextInt();
        String dsemana;
        Swith (dia);{
        case 1:
        dsemana= "Domingo";
        break;
        case 2:
        dsemana="Segunda";
        break;
        case 3:
        dsemana="Terça";
        break;
        case 4:
        dsemana="Quarta";
        case 5:
        dsemana = "Quinta";
        break;
        case 6:
        dsemana = "Sexta";
        break;
        
    }
    }

    private static void Swith(int dia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
