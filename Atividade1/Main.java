package Atividade1;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
    
        double numA;
        double numB;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numA = scan.nextInt();

        System.out.println("Digite outro numero: ");
        numB = scan.nextInt();
        
        System.out.println("A soma dos números: "+ calc.somar(numA, numB));
        System.out.println("A subtração dos números: "+ calc.subtrair(numA, numB));
        System.out.println("A multiplicação dos números: "+ calc.multiplicar(numA, numB));
        System.out.println("A divisão dos números: "+calc.dividir(numA, numB));
        if (calc.Primo(numA)==true) {
            System.out.println(numA + " é primo.");
        } else {
            System.out.println(numA + " não é primo.");
        }

        if (calc.PrimoB(numB)== true) {
            System.out.println(numB + " é primo.");
        } else {
            System.out.println(numB + " não é primo.");
        }

        scan.close();

  }
    
}
