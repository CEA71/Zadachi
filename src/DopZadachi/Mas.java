package DopZadachi;

import java.util.Arrays;

public class Mas {
    public static void main(String[] args) {
        int[] mas = {5, 24, 3, 66, 38, 16, 27};
        int a = mas[0];
        while (mas[0] > mas[1] | mas[1] > mas[2] | mas[2] > mas[3] | mas[3] > mas[4] | mas[4] > mas[5] | mas[5] > mas[6]) {
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] < mas[i - 1]) {
                    a = mas[i - 1];
                    mas[i - 1] = mas[i];
                    mas[i] = a;
                }
            }
        }
        System.out.println(Arrays.toString(mas));

    }
}
