 
package aula03;


public class VariaveisPrimitivas {
    
    public static void main(String[] args){
    String nome = "Julia";
    int idade = 15;
    boolean escolha = true;      //T F
    char sexo  = 'M';           //Caractere
    char letra = '\u0041';     //Codigo Unicode
    byte n1    = 126;         //Numero
    int  n2    = 1000;       //Inteiro
    long n4    = 256666666L;//Inteiros Maiores
    float n5   = 25.80f;   //Decimais
    double n6  = 25.51;   //Decimais Duplos
    System.out.println(escolha);
    System.out.println(sexo);
    System.out.println(letra); 
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n4);
    System.out.println(n5);
    System.out.println(n6);
    System.out.println("==========");
    System.out.printf ("%.2f%n",n5);
    System.out.printf("%.5f%n", n6);
    System.out.println("Julia");
    System.out.printf("%s tem %d anos", nome,idade);
    
    }
 
         
}
