package collection.listinterface;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {

        String []fruits = {"apple" , "orange" , "banana" , "apple" , "orange" , "banana"};
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<fruits.length;i++){
            if(map.containsKey(fruits[i])){
                map.put(fruits[i] , map.get(fruits[i])+1);
            }else{
                map.put(fruits[i] , 1);
            }
        }

        System.out.println(map);
    }
}
