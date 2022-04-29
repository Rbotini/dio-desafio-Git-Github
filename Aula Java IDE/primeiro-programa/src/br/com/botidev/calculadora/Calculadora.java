package br.com.botidev.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Digite o primeiro valor");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor");
        b = scan.nextInt();
        System.out.println("Digite o segundo valor");

        int somar = somar(a, b);
        System.out.println("Soma dos Valores:" + somar);
        int subtrair = subtrair(a, b);
        System.out.println("Subtração dos Valores:" + subtrair);

    }

        public static int somar(int a , int b){
           return a+b;
    }
    public static int subtrair(int a , int b){
        return a - b;
    }
}
