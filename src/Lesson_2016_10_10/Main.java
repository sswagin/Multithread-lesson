package Lesson_2016_10_10;

import java.util.*;

/**
 * Created by Smaug on 10.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        // Структуры данных
        // Коллекции
        // Collection       Map

        // ArrayList - LIFO, это стек - лучше для чтения
        // LinkedList - доступ к данным с двух сторон - добавление и удаление элементов

        // Set - множество - набор однотипных данных без повторений

        // HashSet - метод, который используется для работы с множествами

        Set<String> set = new HashSet<>();
        set.add("addr");
        set.add("addr");
        set.add("addr3");
        set.add("addr3");
        System.out.println(set);

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add("Item: " + i);
        }
        for (int i = 100; i < 105; i++) {
            list3.add("Item: " + i);
        }
        list2.addAll((new ArrayList<String>() {{
            add("Item 27");
            add("Item 25");
            add("Item 23");
        }}));
        list2.addAll(list3);
        Collections.sort(list2);

        for (String item : list2) {
            System.out.println(item);
        }

        System.out.println("Item 27 at position " + list2.indexOf("Item 27"));


        Map<String, Integer> map = new HashMap<>();
        map.put("key", 102);
        map.put("key", 103);

        int value = map.get("key");
        System.out.println(value);

        new ArrayList<String>() {{ add("str"); }};   /// WTF???

        Map<String, String> map2 = new HashMap<>();
        map2.put("key2", "KEY2");
        map2.put("key3", "KEY3");

        String value2 = map2.get("key2");
        System.out.println(value2);

    }
}
