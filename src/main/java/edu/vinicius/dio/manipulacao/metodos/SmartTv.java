package edu.vinicius.dio.manipulacao.metodos;

public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        System.out.println("Aumentando volume");
        volume++;
    }

    public void diminuirVolume(){
        System.out.println("Diminuindo volume");
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void mudarCanalPraCima(){
        System.out.println("Mudando de canal para cima");
        canal++;
    }

    public void mudarCanalPraBaixo(){
        System.out.println("Mudando de canal");
        canal--;
    }
}