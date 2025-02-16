package reflections.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

class Person {
    private int age;
}

public class AccessPrivateField {
    // Method to display class details
    public static void getClassInformation(String className) throws ClassNotFoundException {
        Class clazz = Class.forName(className);
        System.out.println("Class: " + clazz.getName());

        System.out.println("\nMethods:");
        Method methods[] = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }

        System.out.println("\nFields:");
        Field fields[] = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        System.out.println("\nConstructors:");
        Constructor constructors[] = clazz.getDeclaredConstructors();
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i]);
        }
    }

    public static void accessPrivateField() throws Exception {
        Person person = new Person();
        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);
        field.set(person, 30);
        System.out.println("Modified Age: " + field.get(person));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();
        scanner.close();

        try {
            getClassInformation(className);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }

        try {
            accessPrivateField();
        } catch (Exception e) {
            System.out.println("Error accessing private field: " + e.getMessage());
        }
    }
}
