package DopZadachi.Zad_4;

import java.util.Arrays;

public class Library {


    public static void main(String[] args) {
        Book book1 = new Book("name", 0, 0);
        book1.setName("Neznaika");
        book1.setPrice(10);
        book1.setData(1990);
        Book[] zzz = new Book[10];
        zzz[0] = book1;

    }
}
