package Zadachis;

public class Zad_A14 {
    public void findFactorial(int n) {
        // write your code here
        int a = 1;
        for(int i = 1; i <= n; i++){
            a = a * i;
        }
        System.out.print("Factorial = " + a);
    }

    public static void main(String[] args) {
        Zad_A14 zzz = new Zad_A14();
        zzz.findFactorial(5);
    }
}
