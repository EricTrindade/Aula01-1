package Exercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salario Bruto:");
        double sal=sc.nextDouble();
        System.out.println("Valor da prestação");
        double prest=sc.nextDouble();

        if(prest >(sal*0.3)){
            System.out.println("Emprestimo negado!");
        }else{
            System.out.println("Emprestimo aprovado!");
        }
    }
}
