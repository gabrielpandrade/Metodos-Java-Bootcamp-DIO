package com.main.exercicio01;

import java.util.Scanner;

public class exercicio01 {
    static Scanner scan = new Scanner(System.in);

    public static void calculadora(int a, int b) {
        int resposta;
        boolean continuar = true;
        double i, j;

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        while(continuar){
            System.out.println("Sua opção: ");
            resposta = scan.nextInt();
            switch(resposta) {
                case 1:
                    System.out.println("a+b = " + (a + b));
                    continuar = false;
                case 2:
                    System.out.println("a-b = " + (a - b));
                    continuar = false;
                case 3:
                    System.out.println("a*b = " + (a * b));
                    continuar = false;
                case 4:
                    i = (double)a;
                    j = (double)b;
                    System.out.println("a/b = " + (i/j));
                    continuar = false;
            }
        }
    }
}
