package Atividade1;

public class Calculadora {
     
    double numA;
    double numB;

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
     }