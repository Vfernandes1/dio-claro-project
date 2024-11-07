package edu.vinicius.dio.loops;

public class BreakContinue {
    public static void main(String[] args) {
        for(int num=1; num<=5;num++){
            if (num == 3)
                continue;
            if (num == 4)
                break;
            System.out.println(num);
        }
    }
}
