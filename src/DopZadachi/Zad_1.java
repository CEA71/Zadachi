package DopZadachi;

import java.util.Arrays;

public class Zad_1 {

    public static void main(String[] args) {
        int[] a = {10, 5, 4, 24, 55, 3, 66, 38, 16, 27, 1};
        int z;
        int y = a.length;
        while (y > 0) {
            for (int i = 1; i < a.length; i++) {
                if (a[i] < a[i - 1]) {
                    z = a[i-1];
                    a[i-1] = a[i];
                    a[i] = z;
                }
            }
            y--;
        }
        System.out.println(Arrays.toString(a));
    }
}
