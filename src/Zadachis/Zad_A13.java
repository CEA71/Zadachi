package Zadachis;

public class Zad_A13 {
    public void cube(int n) {
        // write your code here
        int a;
        for (int i = 0; i <= n; i++){
            a = i*i*i;
            System.out.println("The cube of " + i + " is equal to " + a);
        }
    }

    public static void main(String[] args) {
        Zad_A13 zzz = new Zad_A13();
        zzz.cube(10);
    }
}
