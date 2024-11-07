package edu.vinicius.dio.loops;

import java.util.Random;

public class DoWhileTest {

private static boolean tocando(){
    boolean atendeu = new Random().nextInt(3)==1;
    System.out.println("Atendeu? " + atendeu);
    return ! atendeu;
}

public static void main() {
    System.out.println("Discando...");
    do{
        System.out.println("Telefone tocando...");
    } while(tocando());
    System.out.println("Alô !!");
}

}