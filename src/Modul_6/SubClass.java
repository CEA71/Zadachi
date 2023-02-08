package Modul_6;

public class SubClass extends SuperClass {
    int num = 77;

    public void myMethod() {
        // Вызываем метод display() подкласса
        this.display();

        // Вызываем метод display() суперкласса
        super.display();

        // Выводим значение переменной num подкласса
        System.out.println("SubClass: " + this.num);

        // Выводим значение переменной num суперкласса
        System.out.println("SuperClass: " + super.num);
    }
    // Метод display() подкласса
    public void display() {
        System.out.println("This is SubClass");
    }

    public static void main(String args[]) {
        SubClass obj = new SubClass();
        obj.myMethod();
    }
}
