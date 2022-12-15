import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        float num = 5.49f;
//
//        System.out.println(Math.round(num));
//        System.out.println(Math.floor(num));
//        System.out.println(Math.ceil(num));

//        int a = (int) (Math.random()*11);
//        System.out.println(a);

        String s = "Aty-baty Soldiers were coming, Aty-baty soldiers were going to the bazaar. ";
//        System.out.println(s.length());
        s = s.concat("Aty-baty: What did you buy? Aty-baty - saamovar!");

        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.substring(9,17));
        System.out.println(s.substring(85, 89));
        boolean t1 = s.endsWith("saamovar");
        boolean t2 = s.endsWith("saamovar!");
        System.out.println("saamovar" + " " + t1);
        System.out.println("saamovar!" + " " + t2);
        String s1 = s.toUpperCase();
        System.out.println(s1);
    }
}
