package Atividade1;

import java.util.Scanner;


public class atividade1 {

   

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
