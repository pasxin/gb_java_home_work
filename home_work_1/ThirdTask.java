import java.util.Scanner;

public class FirstHomeworkThirdTask {
    public static void main(String[] args){
        double firstNumber = 0;
        double secondNumber = 0;
        int action = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("������� �������� (1 - '+',2 - '-',3 - '*' ��� 4 - '/'): ");
        action = input.nextInt();
        System.out.println("������� ������ �����: ");
        firstNumber = input.nextDouble();
        System.out.println("������� ������ �����: ");
        secondNumber = input.nextDouble();
        input.close();
        System.out.println("���������: ");
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
        else System.out.println ("�� �� ����� �������������� ��������");
    }
}