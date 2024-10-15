package edu.vinicius.dio.javaDoc;


public class Calculador {
    public int somar(int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }

    public int somaMultiplica(int n, int x, String m){
        int resultado = 0;
        if (m == "M"){
            resultado = n * x;
        }else {
            resultado = n + x;
        }
        return resultado;
    }

}
