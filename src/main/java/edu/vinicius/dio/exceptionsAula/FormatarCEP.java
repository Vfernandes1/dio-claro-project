package edu.vinicius.dio.exceptionsAula;

public class FormatarCEP {
    public static void main(String[] args) throws CEPException {
        String cepFormatador = formatarCEP("0718");
    }

    public static String formatarCEP(String cep) throws CEPException{
        if (cep.length() != 8) {
            throw new CEPException();
        }
        return cep;
    }
}
