    import java.util.Scanner;

    /**
     * Сделать мини-проект консольный калькулятор, поддерживающий операции: +, -, *, /.
     *
     * 1. Калькулятор принимает на вход два числа и знак операции (+, -, *, /), если был подан другой знак выводится ошибка.
     * 2. В результате вычислений выводится фраза подобного формата: 2 + 3 = 5.
     * 3. Программа работает до тех пор пока пользователь не напишет команду stop.
     *
     */

    public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //третий пункт задания не сделан
        int firstNumber = getInt();
        int secondNumber = getInt();
        char operation = getOperation();
        int result = calculator(firstNumber, secondNumber, operation);
        System.out.println("Результат: " + firstNumber + " " + operation + " " + secondNumber + " = " + result);
    }

    // Метод для получения чисел
    public static int getInt(){
        System.out.println("Введите число:");
        int Number;
        if(sc.hasNextInt()){
            Number = sc.nextInt();
        } else {
            System.out.println("Это не число.");
            sc.next();
            Number = getInt();
        }
        return Number;
    }

    // Метод для получения операции
    public static char getOperation(){
        System.out.println("Введите одну из четырех операций (+, -, *, /):");
        return sc.next().charAt(0);
    }

    // Метод вычисления
    public static int calculator(int Number1, int Number2, char operation){
        int result;
        switch (operation){
            case '+':
                result = Number1 + Number2;
                break;
            case '-':
                result = Number1 - Number2;
                break;
            case '*':
                result = Number1 * Number2;
                break;
            case '/':
                result = Number1 / Number2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calculator(Number1, Number2, getOperation());
        }
        return result;
    }
}
