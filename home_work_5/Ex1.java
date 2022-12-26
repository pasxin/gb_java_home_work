package S5;

import java.util.ArrayList;
import java.util.HashMap;


// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.
public class Ex1 {
    private HashMap<String, ArrayList<String>> data;

    public Ex1() {
        data = new HashMap<>();
    }

    public void addItem(String name, String phone){
        if(data.containsKey(name)){
            var item = data.get(name);
            if(item == null)
                item = new ArrayList<>();
            item.add(phone);
        }
    }

    public void removeItem(String name, String phone){
        if(!data.containsKey(name))
            return;
        var item = data.get(name);
        if(item == null)
            return;
        item.remove(phone);
    }

    public ArrayList<String> getPhonesByName(String name){
        if(data.containsKey(name))
            return data.get(name);
        return null;
    }        
    
    public HashMap<String, ArrayList<String>> getPhoneBook(){
        return data;
    }   





}