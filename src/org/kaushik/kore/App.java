package org.kaushik.kore;
enum StatusE{
    RECIEVED,TRANSIT,FAILED,DELIVERED

}
public class App {
    public static void main(String[] args) {
        StatusE statusE=StatusE.TRANSIT;
        System.out.println(statusE+"   "+statusE.name()+"   "+statusE.ordinal());
    }
}
