import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GenerateArray {
        int a;
        static ArrayList<Integer> arr = new ArrayList<>();

        GenerateArray() {
                System.out.println("������� ����� ������");
                Scanner in = new Scanner(System.in);
                a = in.nextInt();
                System.out.println("������� ������� ������");
                for (int i = 0; i <= a - 1; i++) {
                        arr.add(in.nextInt());
                }
                in.close();
        }

        public static ArrayList<Integer> NewArray() {

                return arr;
        }

        public static ArrayList<Integer> DeleteEven()  {
                ArrayList<Integer> result = new ArrayList<>();

                for (int i = 0; i < arr.size(); i++) {
                        if (arr.get(i) % 2 == 0) {
                                result.add(arr.get(i));
                        }

                }
                return result;
        }

}