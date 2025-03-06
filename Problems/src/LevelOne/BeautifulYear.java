package LevelOne;

import java.util.HashMap;
import java.util.Map;

public class BeautifulYear {
    public static void main(String[] args) {
        int year = 2024;
        System.out.println(calculateBeautifulYear(year));
    }

    private static int calculateBeautifulYear(int year) {
        while(!calculateIfBeautifulYear(++year)){
            ++year;
        }

        return year;
    }

    private static boolean calculateIfBeautifulYear(int year){
        Map<Integer, Boolean> map = new HashMap<>();
        while(year>0){
            int digit = year%10;
            if(map.containsKey(digit)){
                return false;
            }

            map.put(digit, true);
            year=year/10;
        }

        return true;
    }
}
