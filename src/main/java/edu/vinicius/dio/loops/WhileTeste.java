package edu.vinicius.dio.loops;

import java.util.concurrent.ThreadLocalRandom;

public class WhileTeste {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0.0){
            Double valorDoce = valorAleatorio();

            mesada = mesada - valorDoce;
        }
        System.out.println("Valor mesada " + mesada);
    }

    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
