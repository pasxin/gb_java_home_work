import java.util.Scanner;

public class FirstHomeworkSecondTask {
    public static void main(String[] args) {
        //Вывести все простые числа от 1 до 1000
        int resultsimple = 0;
        int temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        resultsimple = input.nextInt();
        input.close();
        //System.out.println("1");
        for (int i = 2; i < resultsimple + 1; i++) {
            for (int j = 2; j < i; j++) {
                //System.out.println(i%j);
                if ((i % j) == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.print(i+" ");
            } else {
                temp = 0;
            }
        }
    }
}
