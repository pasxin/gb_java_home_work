import java.util.Scanner;

public class FirstHomeworkFirstTask {
    public static void main (String[] args) {
        //��������� n-�� ������������ �����(����� ����� �� 1 �� n), n! (������������ ����� �� 1 �� n)
        int number;
        int resultsum=0;
        int resultproduct =1;
        Scanner input = new Scanner(System.in);
        System.out.println("������� �����: ");
        number = input.nextInt();
        input.close();
        System.out.println(number+"-�� ����������� �����");
        for (int i = 0; i <= number; i++) {
            resultsum +=i;
        }
        System.out.println(resultsum);
        System.out.println("������������ ����� �� 1 �� n �����: ");
        for (int i = 1; i <= number; i++) {
            resultproduct *=i;
        }
        System.out.println(resultproduct);
    }
}