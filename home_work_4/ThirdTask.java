import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FourthHomeworkThirdTask {
    public static void main(String[] args) {
        System.out.println(Calc());


    }

    public static double Calc() {
        LinkedList<Double> arr = new LinkedList<>();
        int flag = 0;
        double firstNumber;
        double secondNumber;
        int action;
        double result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        firstNumber = input.nextDouble();
        while (true) {
            System.out.println("Введите второе число: ");
            secondNumber = input.nextDouble();
            System.out.println("Введите действие (1 - '+',2 - '-',3 - '*' или 4 - '/'): ");
            action = input.nextInt();
            System.out.println("Результат: ");
            if (action == 1) {
                result = firstNumber + secondNumber;
            } else if (action == 2) {
                result = firstNumber - secondNumber;
            } else if (action == 3) {
                result = firstNumber * secondNumber;
            } else if (action == 4) {
                result = firstNumber / secondNumber;
            } else System.out.println("Вы не ввели поддерживаемое действие");
            arr.add(result);
            System.out.println(arr.getLast());
            System.out.println("Введите 1 если вычисления окончены. Введите 2, чтобы отменить последнее действие. Введите любое другое целое число чтобы продолжить.");
            flag = input.nextInt();
            if (flag == 1) {
                System.out.println("Выисления окончены");
                break;
            } else if (flag == 2) {
                arr.removeLast();
            }
            try {
                System.out.println("Первое число " + arr.getLast());
            } catch (NoSuchElementException noSuchElementException) {
                arr.add((double) 0);
                System.out.println("Первое число " + arr.getLast());
            }
            firstNumber=arr.getLast();
        }

        System.out.println("Окончательный результат " + arr.getLast());
        input.close();
        return result;

    }
}

