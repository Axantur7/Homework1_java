/**
 *
 * Вывести числа от 1000 до 1 с шагом -2.
 *
 */

public class Main {
    public static void main(String[] args) {

        int start = 1000;
        int step = 2;
        int end = 1;

        for(int i = start; i > end; i -= step) {
            System.out.println(i);
        }

        System.out.println(end);

    }
}