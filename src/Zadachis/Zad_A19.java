package Zadachis;

public class Zad_A19 {
    public void table(int n) {
        // write your code here
        int k;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((k = j * i) + "\t");
            }
            System.out.println("");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " * " + n + " = " + i * n);
        }
    }

    public static void main(String[] args) {
        Zad_A19 zzz = new Zad_A19();
        zzz.table(5);
    }
}
