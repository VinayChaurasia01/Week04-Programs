package collection.map_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {
        // Example input map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        // Call method to invert the map and print result
        System.out.println(invertMap(inputMap));
    }

    public static Map<Integer, List<String>> invertMap(Map<String, Integer> map) {
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        /// Iterate through the original map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int key = entry.getValue();  // This becomes a key in invertedMap
            String value = entry.getKey();   // This goes into the list

            // If key doesn't exist, add a new empty list
            if (!invertedMap.containsKey(key)) {
                invertedMap.put(key, new ArrayList<>());
            }

            // Now add the original key to the corresponding list
            invertedMap.get(key).add(value);
        }

        return invertedMap;
    }
}
