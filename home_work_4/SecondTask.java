import java.util.LinkedList;

public class FourthHomeworkSecondTask {

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public static void main(String[] args) {
    LinkedList<Integer> list;
    GenerateLinkedList generateLinkedList = new GenerateLinkedList();
    list = generateLinkedList.newLinkedList();
    enqueue(list,2);
    dequeue(list);
    System.out.println (list);
    first(list);
    System.out.println (list);
}
    public static void enqueue (LinkedList<Integer> list, int number){
    list.add(number);
    System.out.println (list);
    }
    public static void dequeue(LinkedList<Integer> list){
    System.out.println (list.removeFirst());
    }
    public static void first(LinkedList<Integer> list){
        System.out.println (list.getFirst());
    }
}