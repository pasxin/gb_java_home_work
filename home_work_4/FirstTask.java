import java.util.Collections;
import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class FourthHomeworkFirstTask {
    public static void main(String[] args) {
        LinkedList<Integer> list;
        GenerateLinkedList generateLinkedList = new GenerateLinkedList();
        list = generateLinkedList.newLinkedList();
        System.out.println(list);
        System.out.println(reverseLinkedList(list));

    }
    public static  LinkedList <Integer> reverseLinkedList (LinkedList <Integer> list){
    /* Collections.reverse(list);
    мне кажется это слишком простая реализация даже для нашего домашнего задания:-) Так что предлагаю другую.
     */
        LinkedList <Integer> result = new LinkedList<>();
        while (!list.isEmpty()) {
            result.add(list.removeLast());
        }

    return result;
}

}