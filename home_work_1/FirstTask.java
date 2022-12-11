import java.util.Scanner;

public class FirstHomeworkFirstTask {
    public static void main (String[] args) {
        //Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        int number;
        int resultsum=0;
        int resultproduct =1;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        number = input.nextInt();
        input.close();
        System.out.println(number+"-ое треугольное число");
        for (int i = 0; i <= number; i++) {
            resultsum +=i;
        }
        System.out.println(resultsum);
        System.out.println("Произведение чисел от 1 до n равно: ");
        for (int i = 1; i <= number; i++) {
            resultproduct *=i;
        }
        System.out.println(resultproduct);
    }
}