package DopZadachi.Zad_4;

public class Book {
    private String name;
    private int price;
    private int data;

    public Book(String name, int price, int data) {
        this.name = name;
        this.price = price;
        this.data = data;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getData() {
        return data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setData(int data) {
        this.data = data;
    }
}
