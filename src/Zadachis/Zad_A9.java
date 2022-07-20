package Zadachis;

public class Zad_A9 {
    public void findMedian(int a, int b, int c) {
        // write your code here
        if ((a > b & a < c) | (a < b & a > c))
            System.out.print(a);
        if ((b > a & b < c) | (b < a & b > c))
            System.out.print(b);
        if ((c > a & c < b) | (c < a & c > b))
            System.out.print(c);
        if (a == b & a > c)
            System.out.print(a);
        if (c == a & c > b)
            System.out.print(c);
        if (b == c & b > a)
            System.out.print(b);
    }

    public static void main(String[] args) {
        Zad_A9 zzz = new Zad_A9();
        zzz.findMedian(7, 7, 7);
    }
}
