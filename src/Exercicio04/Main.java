package Exercicio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("digite o numero:");
        double num=sc.nextDouble();

        if(num >= 0 && num <= 100){
            System.out.println("está!");
        }else{
            System.out.println("não está!");
        }
    }
}
