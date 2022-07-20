package Zadachis;

public class Zad_A7 {
    public void print(String string, int n) {
        // write your code here
        for(int i = 0; i < n; i++){
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        Zad_A7 zzz = new Zad_A7();
        zzz.print("hello", 3);
    }
}
