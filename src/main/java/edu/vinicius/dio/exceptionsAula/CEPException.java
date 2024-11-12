package edu.vinicius.dio.exceptionsAula;

public class CEPException extends Exception{
    public static String wrongCepException(String errorMessage) {
        return ("CEP Inválido");
    }
}
