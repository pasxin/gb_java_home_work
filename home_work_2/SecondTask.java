import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class SecondHomeworkSecondTask {
    public static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("log2.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        List<Integer> arr = GenerateArray();
        BubbleSort((ArrayList<Integer>) arr);
    }

    public static List<Integer> GenerateArray() throws IOException {
        int a;
        ArrayList <Integer> arr = new ArrayList<>();
        System.out.println("Введите длину списка");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("Введите элемент списка");
        for (int i = 0; i <= a-1; i++) {
            arr.add (in.nextInt());
        }
        in.close();
        return arr;
    }

    public static void BubbleSort(ArrayList <Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j + 1) < arr.get(j)) {
                    int swap = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, swap);
                    logger.log (Level.INFO, String.valueOf(arr));
                }
            }
        }
    }


}