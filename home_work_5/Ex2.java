package S5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Пусть дан список сотрудников:Иван Иванов 
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 * Отсортировать по убыванию популярности.
 */
public class Ex2 {
    private ArrayList<String> employees;

    public Ex2(ArrayList<String> employees) {
        this.employees = employees;
    }

    public SortedSet<Ex2Entity> getEmployees(){
        SortedSet<Ex2Entity> uniqItems = new TreeSet<Ex2Entity>((o1, o2) -> o1.compareTo(o2)); 
          
        for (String string : employees) {
            int item = Collections.frequency(employees, string);
            uniqItems.add(new Ex2Entity(string, item));
        }
        return uniqItems;
    }

}


