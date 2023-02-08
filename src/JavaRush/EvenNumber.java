package JavaRush;

public class EvenNumber {
    static int evenNumber;

    public EvenNumber() {
    }

    static void incrementBy2(){
        evenNumber = evenNumber + 2;
        System.out.println(evenNumber);
    }

    public static void main(String[] args) {
        System.out.println(evenNumber);
        incrementBy2(); // 2
        incrementBy2(); // 4
//        incrementBy2(); // 6
//        incrementBy2(); // 8
//        System.out.println(evenNumber);
    }
}
