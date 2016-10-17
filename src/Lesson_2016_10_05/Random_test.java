package Lesson_2016_10_05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Smaug on 05.10.2016.
 */
public class Random_test {

    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(80)-40;
        }

        Arrays.sort(array); //сортировка массива
        System.out.println(Arrays.toString(array)); // вывод массива
    }


}

