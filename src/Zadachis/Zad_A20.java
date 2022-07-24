package Zadachis;

public class Zad_A20 {
    public void drawRectangle(int n, int m, String s) {
        // write your code here
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                if (i == 1 | i == n){
                    System.out.print(s);
                } else {
                    if (j == 1 | j == m) {
                        System.out.print(s);
                    } else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Zad_A20 zzz = new Zad_A20();
        zzz.drawRectangle(6,10,"+");
    }
}
