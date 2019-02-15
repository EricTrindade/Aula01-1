package Exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("digite a altura:");
        double alt=sc.nextDouble();
        System.out.println("digite o raio:");
        double raio=sc.nextDouble();

        double calc= 3.141559*(raio*raio)*alt;
        System.out.println(calc);
    }
}
