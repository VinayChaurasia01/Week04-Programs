package collection.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    public static List<Integer> reverseList(List<Integer> list){
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.remove(list.size() - 1));
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List : " + list);

        reverseList(list);

        System.out.println("Reversed  list : " + list);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original linkedList : " + linkedList);

        reverseList(linkedList);

        System.out.println("Reversed  linkedList : " + linkedList);
    }
}
