package junit_testing.basic;

import java.util.List;

public class ListManager {
    // Method to add an element to the list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Method to remove an element from the list (if present)
    public boolean removeElement(List<Integer> list, int element) {
        return list.remove(Integer.valueOf(element)); // Removes only the first occurrence
    }

    // Method to get the size of the list
    public int getSize(List<Integer> list) {
        return list.size();
    }
}

