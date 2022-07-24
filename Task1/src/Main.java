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
    while (true) {
        int firstNumber = getInt();
        int secondNumber = getInt();

        while (secondNumber == 0){
            System.out.println("На ноль делить нельзя.");
            secondNumber = getInt();
        }

        char s = 's';
        char S = 'S';
        char action = getOperation();
        if (action == s || action == S) {
            System.out.println("Программа завершена");
            break;
        }else{
            int result = calculator(firstNumber, secondNumber, action);
            System.out.println("Результат: " + firstNumber + " " + action + " " + secondNumber + " = " + result);
        }
    }
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

    // Метод для получения операции или для закрытия программы
    public static char getOperation(){
        System.out.print("Введите одну из четырех операций (+, -, *, /) ");
        System.out.println("или для завершения программы введите слово \"Stop: \"");
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
