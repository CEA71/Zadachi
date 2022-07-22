package Zadachis;

public class Zad_A12 {
    public static void isPow(int n) {
        // write your code here
        int i = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
                i = i + 1;
                if (n == 2)
                    break;
            } else {
                System.out.println("NO");
                break;
            }
        }
        if (n == 2)
        System.out.println(i);

    }

    public static void main(String[] args) {
        isPow(64);
    }
}
