package Zadachis;

public class Zad_A11 {
    public void print(int m, int n) {
        // write your code here
        int[][]bbb = new int[m][n];
        for(int i = 0; i < m; i++){
            System.out.println();
            for(int j = 0; j < n; j++){
                bbb[i][j] = 8;
                System.out.print(bbb[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Zad_A11 zzz = new Zad_A11();
        zzz.print(4, 15);
    }
}
