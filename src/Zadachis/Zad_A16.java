package Zadachis;

public class Zad_A16 {
    public void signal(double time) {
        while (time > 5) {
            time = time - 5;
        }
        if (time > 0 & time < 3) {
            System.out.println("green");
        } else if (time > 3 & time < 4) {
            System.out.println("yellow");
        } else
            System.out.println("red");
    }

    public static void main(String[] args) {
        Zad_A16 zzz = new Zad_A16();
        zzz.signal(155.5);
    }
}
