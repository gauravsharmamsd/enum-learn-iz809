package org.kaushik.kore;

import java.util.Arrays;

enum Week{
    SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THIRSDAY(4),FRIDAY(5),SATURDAY(6);
    int dayNo;
    private Week(int no){
        this.dayNo=no;
    }
    public int getDayNo(){
        return this.dayNo;
    }
}
public class Test {
    public static void main(String[] args) {
        Arrays.stream(Week.values()).forEach(k->{
            System.out.println(k.name()+"   "+k.getDayNo());
        });
    }
}
