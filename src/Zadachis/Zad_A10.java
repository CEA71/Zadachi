package Zadachis;

public class Zad_A10 {
    public void checkTriangle(int a, int b, int c) {
        // write your code here
        if ((a > 0 & b > 0 & c > 0) & ((a + b) > c) & ((a + c) > b) & ((b + c) > a)) {
            System.out.print("YES");
        } else
            System.out.print("NO");

    }

    public static void main(String[] args) {
        Zad_A10 zzz = new Zad_A10();
        zzz.checkTriangle(10, 2, 1);
    }
}
