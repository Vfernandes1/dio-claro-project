package edu.vinicius.dio.LearningArgs;

import java.util.Locale;
import java.util.Scanner;

public class LearnArgs {

    //Mudar para Main normal quando quiser testar no terminal
    public static void mainTwo(String[] args){

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args [3]);

        System.out.println("Olá meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho "+idade+" anos");
        System.out.println("Minha altura é de "+altura);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome ");
        String scanNome = scanner.next();

        System.out.println("Digite sua idade ");
        int scanIdade = scanner.nextInt();

        System.out.println("Digite sua altura ");
        double scanAltura = scanner.nextDouble();
    }
}
