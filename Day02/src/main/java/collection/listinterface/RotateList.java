package collection.listinterface;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RotateList {

    public static List<Integer> rotateList(List<Integer> list , int rotationPoint){

        int size = list.size();
        if(rotationPoint > size){
            rotationPoint = rotationPoint % size;
        }

        for (int i = 0; i < rotationPoint; i++) {

            // store last element of the list in a temp variable
            int temp = list.get(size-1);

            // perform iteration and shift element to the right
            for (int j = size-1; j > 0; j--) {
                list.set(j, list.get(j - 1));
            }
            list.set(0, temp);
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter rotation point (0-Based Indexing):");
        int rotationPoint = input.nextInt();

        rotateList(list,rotationPoint);

        System.out.println(list);
    }
}
