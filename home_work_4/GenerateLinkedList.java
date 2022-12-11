import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class GenerateLinkedList {
    int a;
    static LinkedList<Integer> arr = new LinkedList<>();

    GenerateLinkedList() {
        System.out.println("Введите длину списка");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        for (int i = 0; i <= a - 1; i++) {
            arr.add((int) (Math.random()*100));
        }
        in.close();
    }

    public static LinkedList<Integer> newLinkedList() {

        return arr;
    }
}