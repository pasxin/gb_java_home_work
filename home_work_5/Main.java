package S5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*
         * Реализуйте структуру телефонной книги с помощью HashMap, 
         * учитывая, что 1 человек может иметь несколько телефонов.
         */
        // структура в классе Ex1.java

        ex2();
        ex3();
    }

    public static void ex3(){
        System.out.println("Написать метод, который переведет число из римского формата записи в арабский.");
        System.out.println("Конвертация возможна в диапазоне от 0 до 3000");
        int num = 2022;
        System.out.println("Число " + num + " в римском формате равно " + new Ex3().convert(num));  
        System.out.println();
    }

    public static void ex2(){
        System.out.println("Пусть дан список сотрудников:Иван Иванов Написать программу");
        System.out.println("которая найдет и выведет повторяющиеся имена с количеством повторений.");
        System.out.println("Отсортировать по убыванию популярности.");

        ArrayList<String> employees = new ArrayList<String>();
        employees.add("Иванов");
        employees.add("Петров");
        employees.add("Сидоров");
        employees.add("Гилёв");
        employees.add("Иванов");
        employees.add("Титов");
        employees.add("Петров");
        employees.add("Иванов");
        System.out.println("Исходный список: " + employees);
        var ex = new Ex2(employees);
        System.out.println("Только повторяющиеся: " + ex.getEmployees());
        System.out.println();
    }



    /*
     * Проверка выражения на валидную расстановку скобок
     */
    public static boolean isBracketsValid(String data){
        var brackets = new HashMap<Character, Character>();
        brackets.put('(',')');
        brackets.put('[',']');

        var st = new Stack<Character>();

        var chars = data.toCharArray();

        for(Character c : chars){
            if(brackets.containsKey(c))
                st.push(c);
            else if(brackets.containsValue(c)){
                if(st.empty())
                    return false;
                
                var close = brackets.get(st.peek());
                
                if(close.equals(c))
                    st.pop();
                else
                    return false;
            }
        } 
        return st.empty();
    }
}