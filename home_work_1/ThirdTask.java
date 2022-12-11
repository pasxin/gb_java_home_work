import java.util.Scanner;

public class FirstHomeworkThirdTask {
    public static void main(String[] args){
        double firstNumber = 0;
        double secondNumber = 0;
        int action = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите действие (1 - '+',2 - '-',3 - '*' или 4 - '/'): ");
        action = input.nextInt();
        System.out.println("Введите первое число: ");
        firstNumber = input.nextDouble();
        System.out.println("Введите второе число: ");
        secondNumber = input.nextDouble();
        input.close();
        System.out.println("Результат: ");
        if (action == 1){
            System.out.println(firstNumber+secondNumber);
        }
        else if (action == 2){
            System.out.println(firstNumber-secondNumber);
        }
        else if (action == 3){
            System.out.println(firstNumber*secondNumber);
        }
        else if (action == 4){
            System.out.println(firstNumber/secondNumber);
        }
        else System.out.println ("Вы не ввели поддерживаемое действие");
    }
}