package test_pack1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Smaug on 14.09.2016.
 */
public class Test_2016_09_14_Regular {
    private static void main(String[] args) {

        // Изучение паттернов и матчеров
        Pattern pattern = Pattern.compile("\\$[0-9a-z]+\\*", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("jhf$1sd*fvdjf$1sd*vb345i$1sd*uh$5kJU*$1sd*htg");
        int i = 0;
        while (matcher.find()) {
            if (i >= 3) {
                break;
            }
            System.out.println("start " + matcher.start() + " end " + matcher.end());
            i++;
        }

        //изучение цикла while
        i = 0;
        while (i <= 56) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();
        System.out.println();

        StringBuilder str = new StringBuilder("asd");
        while (str.length() > 0) {
            str.deleteCharAt(str.length() - 1);
            System.out.println(str);
        }

        //изучение цикла while-do
        String str2 = "macaronia!";

        int counter = 0;
        System.out.println(str2);
        do {
            counter++;

        } while (counter < str2.length());
        System.out.println(counter);



        // в чём разница между объектами и примитивами?
        System.out.println();
        //изучаем массивы

        int[] data = {3, 5, 67, 345, 2346, 234234};
        i = 0;
        while (i < data.length) {
            if (data[i] > 100) {
                System.out.println("Элемент массива №" + i + " = " + data[i]);
            }
            i++;
        }
        System.out.println();

        String[] datastr = new String[]{"yes", "no", "never!"};
        i = 0;
        while (i < datastr.length) {
            System.out.println("Элемент массива №" + i + " = " + datastr[i]);
            i++;
        }

        System.out.println();

        char[] datach = new char[]{'a','s','f','r'};
        i = 0;
        while (i < datach.length) {
            System.out.println("Элемент массива №" + i + " = " + datach[i]);
            i++;
        }

        //Изучаем цикл FOR
        int array[] = new int[10];
        for (int in = 0; in < array.length; in++){
            array[in] = in * 5;
        }
        for (int in = 0; in < array.length; in++){
            System.out.print(array[array.length - 1 - in] + " ");
            System.out.println();
        }

// изучаем FOR Each
        System.out.println("изучаем FOR Each");
        for ( int il : array){
            System.out.print(il + " ");
        }
        System.out.println();
        System.out.println();

        String[] array2 = {"123", "234", "345", "456"};
        System.out.print(Arrays.toString(array2));

    }


}
