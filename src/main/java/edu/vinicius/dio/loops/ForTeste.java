package edu.vinicius.dio.loops;

public class ForTeste {
    public static void main(String[] args) {
        for (int pessoasBravasComOVini = 0; pessoasBravasComOVini <= 5; pessoasBravasComOVini++) {
            System.out.println("Contando as pessoas bravas " + pessoasBravasComOVini);
        }
    }

    public static void interagindoArrays(){
        String alunos [] = {"Vitorino", "Vitor", "Vita"};
        for(int x = 0; x < alunos.length; x++){
            System.out.println("Nome do Aluno " + alunos[x]);
        }
    }
}