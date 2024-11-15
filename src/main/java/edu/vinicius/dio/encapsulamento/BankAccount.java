package edu.vinicius.dio.encapsulamento;

public class BankAccount {
    private String accountNumber;
    private double balance = 0;

    public static void main(String[] args) {
    }

    public static double deposit(double amount, double balance){
        return balance = amount + balance ;
    }

    public static double withdraw(double amount, double balance){
        if (amount > balance){
            System.out.println("Saldo insuficiente com base no valor de retirada especificado");
        }
        return balance = amount - balance;
    }

    public static double getBalance(double balance){
        return balance;
    }




}
