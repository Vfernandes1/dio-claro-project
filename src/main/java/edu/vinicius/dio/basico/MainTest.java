package edu.vinicius.dio.basico;

public class MainTest {
    public static void main(String[] args) {
        int idadeAmigo = 22;
        System.out.printf("Hello and welcome!");
        System.out.println("Hi there!" + idadeAmigo);
        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
            System.out.println(somar(5, 4));
        }
    }

    public static int somar(int num1, int num2){
        return num1 + num2;
    }
}