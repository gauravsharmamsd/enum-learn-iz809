package org.kaushik.kore;


import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        String sh="TRANSIT";
        StatusE statusE;
      statusE= check(sh);
        System.out.println(statusE+"   "+statusE.name()+"   "+statusE.ordinal());
        switch (statusE){
            case TRANSIT:
                System.out.println("im in transit");
                break;
            case FAILED:
                System.out.println("im failed");
                break;
            case RECIEVED:
                System.out.println("your package recieved");
                break;
            default:
                System.out.println("im delieved");
                break;
        }
    }

    private static StatusE check(String sh) {

        return Arrays.stream(StatusE.values()).filter(statusE -> statusE.name().equals(sh)).findFirst().get();
    }
}
