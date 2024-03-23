package Atividade1;

import java.util.Scanner;


public class atividade1 {

    public static double somar(double numA,double numB){
        return numA + numB;
    }

    public static double subtrair(double numA,double numB){
        return numA - numB;
    }

    public static double multiplicar(double numA,double numB){
        return numA * numB;
    }

    public static double dividir(double numA,double numB){
        return numA / numB;
    }

    public static boolean Primo(double numA) {
        if (numA <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numA); i++) {
            if (numA % i == 0) {
                return false; 
            }
        }
        return true;  
    }

    public static boolean PrimoB(double numB) {
        if (numB <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numB); i++) {
            if (numB % i == 0) {
                return false; 
            }
        }
        return true;  
    }
    


    public static void main(String[] args) {
    
        double numA;
        double numB;

        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numA = scan.nextInt();

        System.out.println("Digite outro numero: ");
        numB = scan.nextInt();

        
        System.out.println("A soma dos números: "+ somar(numA, numB));
        System.out.println("A subtração dos números: "+ subtrair(numA, numB));
        System.out.println("A multiplicação dos números: "+ multiplicar(numA, numB));
        System.out.println("A divisão dos números: "+ dividir(numA, numB));
        if (Primo(numA)==true) {
            System.out.println(numA + " é primo.");
        } else {
            System.out.println(numA + " não é primo.");
        }

        if (PrimoB(numB)== true) {
            System.out.println(numB + " é primo.");
        } else {
            System.out.println(numB + " não é primo.");
        }



        scan.close();

      

  }
    
}
