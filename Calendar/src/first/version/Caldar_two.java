package first.version;

import java.util.ArrayList;

public class Caldar_two {
    ArrayList<String> cal = new ArrayList<>();
    int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
    String year;
    String month;
    int space;

    Caldar_two(String printDate, int space){
        this.year = printDate.substring(0,4);
        this.month = printDate.substring(4,6);
        this.space = space;
    }

    public void makeCal() {

        for(int i=0;i<space;i++){
            cal.add("  ");
        }

        for(int i=1;i<=maxDays[Integer.parseInt(month) -1];i++){
            cal.add(String.valueOf(i));
        }

        for(int i=0;i<7;i++){
            cal.add("  ");
        }
    }

    public void printCal(){
        int isEnter = 6;
        System.out.println(year+"년도 "+month+"월");
        System.out.println("일 월 화 수 목 금 토");
        for(int i=0;i<cal.size();i++){
            System.out.printf("%2s",cal.get(i));
            System.out.print(" ");
            if(i==isEnter){
                System.out.println();
                isEnter+=7;
            }
        }
    }
}
