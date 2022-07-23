package Zadachis;

public class Zad_A15 {
    public void years(int year) {
        boolean isLeap;
        if (year % 4 == 0 & year % 100 != 0){
            isLeap = true;
            if (year % 100 == 0 & year % 400 == 0)
                isLeap = true;
        } else
            isLeap = false;
        if (isLeap) {
            System.out.println("This year is a leap year");
        } else
            System.out.println("This year is not a leap year");
    }

    public static void main(String[] args) {
        Zad_A15 zzz = new Zad_A15();
        zzz.years(1804);
    }
}
