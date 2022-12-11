import java.io.*;
import java.util.logging.*;
import java.util.ArrayList;
import java.util.Arrays;
public class SecondHomeworkFirstTask {
    /*
           ������ ������: ���������� ���� � ������ �� �������, ����������� �� ��������, ����� ������ ������ INFO/DEBUG.
           � ��������� ���������� ������� � �������� � ���� �� ���������� ������� � ��������� ������ ������ �
           � ���� �������� INFO/WARNING
           */
    public static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("log1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        writer();
    }
        public static ArrayList<String> getFiles () {
            logger.log(Level.INFO, "������� ����� getFiles");
            File file = new File("C:\\TEST");
            File[] files = file.listFiles();
            ArrayList<String> names;
            try {
                names = new ArrayList<String>(Arrays.asList(file.list()));
                return names;
            } catch (NullPointerException nullPointerException) {
                logger.log(Level.WARNING, "����� �� ������� � ���� �����");
            }
            return null;
        }

        public static void writer () throws IOException {
            logger.log(Level.INFO, "������� ����� writer");
            FileOutputStream fileOutputStream = new FileOutputStream("fifthTask.txt");
            try {
                ArrayList<String> files = getFiles();
                for (String file : files) {
                    file += "\n";
                    fileOutputStream.write(file.getBytes());

                }
            } catch (NullPointerException nullPointerException) {
                logger.log(Level.WARNING, "� ���������� ������ ������ null");
            }
        }
        public static void ParsingFile () throws IOException {
            BufferedReader br;
            String str;
            ArrayList<String> arr = new ArrayList<>();
            br = new BufferedReader(new FileReader("log.txt"));
            while ((str = br.readLine()) != null) {
                if ((str.contains("INFO")) || (str.contains("WARNING"))) {
                    arr.add(str);
                }
            }
            br.close();
            System.out.println(arr);

        }
    }
