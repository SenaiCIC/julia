/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantos numeros você quer somar?");
        int q = sc.nextInt( );
        int c = 0;
        double res = 0;
        while(c<q){
            System.out.println("Digite o "+(c+1)+"°numero");
            double r = sc.nextDouble();
            res = r+res;
            c++;
            
        }
        
        System.out.println("a soma é"+res);
        
    }
}
