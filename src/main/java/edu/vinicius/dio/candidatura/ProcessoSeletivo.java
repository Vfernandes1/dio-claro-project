package edu.vinicius.dio.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisarCandidato(200);

        String [] candidatos = {"Matheus", "Lucia", "Isabel", "Luiz", "Lucilia"};

        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;

        do {
            atendeu=atender();
            continuarTentando = !atendeu;
            if (continuarTentando=true){
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso");
            }

        }while (continuarTentando=true && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato");
        }else {
            System.out.println("Não conseguimos contato");
        }
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"Matheus", "Lucia", "Isabel", "Luiz", "Lucilia"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.00;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato +
                    "Solicitou esse valor" + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato" + candidato + "foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static void impressaoSelecionados(String candidatosSelecionados){
        String [] candidatos = {"Matheus", "Lucia", "Isabel", "Luiz", "Lucilia"};
        for (int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato passou : " + candidatos[i]);
        }

        for(String candidato : candidatos){
            System.out.println("O candidato passou : " + candidato);
        }
    }

    static void ligacaoCandidato(){

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para candidato com contraproposta");
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
