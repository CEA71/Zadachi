package Zadachis;

public class Zad_A17 {
    public void numberToWorld(int number) {
        // write your code here
        if (number < 0 | number > 999) {
            System.out.println("enter a number from 0 to 999");
            return;
        }
        int a;
        if (number < 10) {
            a = number % 2;
            if (a == 0) {
                System.out.println("even single digit number");
            } else
                System.out.println("odd single digit number");
        } else if (number >= 10 & number < 100) {
            a = number % 2;
            if (a == 0) {
                System.out.println("even two-digit number");
            } else
                System.out.println("odd two-digit number");
        } else if (number >= 100 & number < 1000) {
            a = number % 2;
            if (a == 0) {
                System.out.println("even three-digit number");
            } else
                System.out.println("odd three-digit number");
        }
    }

    public static void main(String[] args) {
        Zad_A17 zzz = new Zad_A17();
        zzz.numberToWorld(89);
    }
}
