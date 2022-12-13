package Practika;

public class Solution {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишите тут ваш код
        int a = array.length;
        int[] mass = new int [array.length];
        for (int i = 0; i < array.length; i++){
            mass[(a-1) - i] = array[i];
        }
        for (int i = 0; i < mass.length; i++){
            array[i] = mass[i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
