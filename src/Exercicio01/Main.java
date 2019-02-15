package Exercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Digite o valor da conta");

        double cont = sc.nextDouble();

        double res=((cont*10)/100)+cont;
        System.out.println(res);

    }
}
