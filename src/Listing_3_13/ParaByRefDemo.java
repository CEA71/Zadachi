package Listing_3_13;

public class ParaByRefDemo {
    public static void main(String[] args) {

        ParaByRef p = new ParaByRef(33,13);
        ParaByRef q = new ParaByRef(7,20);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);

            p.callByRef(q);

            System.out.println("q.x = " + q.x);
            System.out.println("q.y = " + q.y);
    }
}
