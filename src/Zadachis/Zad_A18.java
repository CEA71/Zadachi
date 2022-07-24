package Zadachis;

public class Zad_A18 {
    public void syracuseSequence(int number) {
        // write your code here

        int a = 0;
        String text = number + " >- ";
        while (number > 1) {

            if (number % 2 != 0) {

                number = 3 * number + 1;
                text = text + " " + number + " >- ";
                a++;

            } else {
                number /= 2;

                if (number == 1) {
                    text = text + " " + number;
                    a++;
                } else {
                    text = text + " " + number + " >- ";

                    a++;
                }
            }
        }

        System.out.println(a);
        System.out.println(text);
}

    public static void main(String[] args) {
        Zad_A18 zzz = new Zad_A18();
        zzz.syracuseSequence(17);
    }
}
