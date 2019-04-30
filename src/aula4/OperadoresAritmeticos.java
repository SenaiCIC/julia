
package aula4;


public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        //Operadores + soma
        //Operadores - subtração
        //Operadores / divisão
        //Operadores * multiplicação
        //Operadores % módulo
        
        int a = 5;
        int b = 2;
        int result;
        result = a%b;
        System.out.println("modulo de a e b:"+result);
        result = a + b;
        System.out.println("soma de a e b:"+result);  
        result = a-b;
        System.out.println("subtração de a e b:"+result);
        result = a*b;
        System.out.println("multiplicação de a e b: "+result);
        double resultado;
        resultado =(double) a/b;
        System.out.println("divisão de a e b :"+resultado);    
    }
}
