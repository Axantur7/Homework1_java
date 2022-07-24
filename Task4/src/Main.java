import java.util.Scanner;

/**
 *  На вход программы подаётся 4 числа: вес подарка, вес апельсина, вес яблока, вес груши.
 *  Каждый подарок состоит из произвольного набора апельсинов, яблок и груш.
 *  Необходимо вывести количество способов составить подарок с заданными весом.
 * 	Пример:
 * 	Вход программы: 40 25 15 10
 * 	Ответ: 3
 * 	Пояснение:
 * 	1 вариант - 1 апельсин весом 25 и 1 яблоко весом 15.
 * 	2 вариант - 2 яблока весом 15 и 1 груша.
 * 	3 вариант - 4 груши.
 */

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите вес подарка: ");
        int weightOfGift = getWeight(); // 40
        System.out.println("Введите вес апельсина: ");
        int weightOfOrangeInCurrentGift = getWeight(); // 25
        System.out.println("Введите вес яблока: ");
        int weightOfAppleInCurrentGift = getWeight(); // 15
        System.out.println("Введите вес груши: ");
        int weightOfPearInCurrentGift = getWeight(); // 10

        int maxNumberOfOrange = weightOfGift/weightOfOrangeInCurrentGift;
        int maxNumberOfApple = weightOfGift/weightOfAppleInCurrentGift;
        int maxNumberOfPear = weightOfGift/weightOfPearInCurrentGift;

        int weightOfOrange, weightOfApple, weightOfPear;
        weightOfOrange = 0;

        int count = 0;
        for (int i = 0; i <= maxNumberOfOrange; i++, weightOfOrange += weightOfOrangeInCurrentGift){
            weightOfApple = 0;
            for (int j = 0; j <= maxNumberOfApple; j++, weightOfApple += weightOfAppleInCurrentGift){
                weightOfPear = weightOfGift - weightOfOrange - weightOfApple;
                int NumberOfPear =  weightOfPear / weightOfPearInCurrentGift;
                if ((NumberOfPear >=  0 &&  NumberOfPear <= maxNumberOfPear) && weightOfPear == NumberOfPear * weightOfPearInCurrentGift){
                    count ++;
                }
            }
        }
        System.out.println("Количество способов составить подарок: " + count);
    }

    public static int getWeight(){
        int Number;
        // Проверка на Int
        if(sc.hasNextInt()){
            Number = sc.nextInt();
        } else {
            System.out.println("Вы ввели не число/вес.");
            sc.next();
            Number = getWeight();
        }
        // Проверка на отрицание
        if (Number <= 0){
            System.out.println("Вес не может быть 0 или отрицательным");
            Number = getWeight();
        }
        return Number;
    }

}


