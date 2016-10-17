package HomeWork;

import java.util.Arrays;

/**
 * Created by Smaug on 26.09.2016.
 */
public class HomeWork_2016_09_26 {
    public static void main(String[] args) {
        // Перестановка массива
        int[] data1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] data2 = {15, 25, 35, 45, 55};


        System.out.println("Домашнее задание 26 сентября 2016");
        System.out.println("Объединить два отсортированных массива");
        System.out.println("Исходные массивы:");
        System.out.println(Arrays.toString(data1));
        System.out.println(Arrays.toString(data2));
        System.out.println();
        concatArrays(data1, data2);
    }

    private static void concatArrays(int[] data1, int[] data2) {
        int[] result = new int[data1.length + data2.length];
        int i = 0;
        while (i * 2 < result.length) {
            if (i >= data1.length) {
                System.out.println("Кончился первый массив, i=" + i);
                for (int j = i * 2; j < result.length; j++) {
                    result[j] = data2[j - data1.length];
                }
                System.out.println("Полученный массив:");
                System.out.println(Arrays.toString(result));
                return;

            }
            if (i >= data2.length) {
                System.out.println("Кончился второй массив, i=" + i);
                for (int j = i * 2; j < result.length; j++) {
                    result[j] = data1[j - data2.length];
                }
                System.out.println("Полученный массив:");
                System.out.println(Arrays.toString(result));
                return;

            }

            if (data1[i] > data2[i]) {
                result[2 * i] = data2[i];
                result[2 * i + 1] = data1[i];
            } else {
                result[2 * i] = data1[i];
                result[2 * i + 1] = data2[i];
            }
            i++;

        }

        System.out.println("Полученный массив:");
        System.out.println(Arrays.toString(result));

    }
}
