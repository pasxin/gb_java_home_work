package S5;

import java.util.HashMap;

//Написать метод, который переведет число из римского формата записи в арабский. 
//Например, MMXXII = 2022 (правила см. во вложениях к уроку, где ссылка на репозиторий).
public class Ex3 {
    
    private HashMap<Integer, String> romeMapper = new HashMap<>();

    public Ex3() {
        romeMapper.put(1, "I");
        romeMapper.put(2, "II");
        romeMapper.put(3, "III");
        romeMapper.put(4, "IV");
        romeMapper.put(5, "V");
        romeMapper.put(6, "VI");
        romeMapper.put(7, "VII");
        romeMapper.put(8, "VIII");
        romeMapper.put(9, "IX");
        romeMapper.put(10, "X");
        romeMapper.put(20, "XX");
        romeMapper.put(30, "XXX");
        romeMapper.put(40, "XL");
        romeMapper.put(50, "L");
        romeMapper.put(60, "LX");
        romeMapper.put(70, "LXX");
        romeMapper.put(80, "LXXX");
        romeMapper.put(90, "XC");
        romeMapper.put(100, "C");
        romeMapper.put(200, "CC");
        romeMapper.put(300, "CCC");
        romeMapper.put(400, "CD");
        romeMapper.put(500, "D");
        romeMapper.put(600, "DC");
        romeMapper.put(700, "DCC");
        romeMapper.put(800, "DCCC");
        romeMapper.put(900, "CM");
        romeMapper.put(1000, "M");
        romeMapper.put(2000, "MM");
        romeMapper.put(3000, "MMM");
    }

    public String convert(int number){
        if(number < 1 || number > 3000)
            return "ОШИБКА!!! Необходимо ввести число в диапазоне от 1 до 3000";
        String rome = "";
        int i = 1;
        while (number > 1) {
            var current = number % 10;
            if(current > 0)
                rome = romeMapper.get(current * i) + rome;
            i *= 10;
            number /= 10;
        }
        return rome;
    }

    

}