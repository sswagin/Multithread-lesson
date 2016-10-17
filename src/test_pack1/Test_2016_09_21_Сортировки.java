package test_pack1;

import java.util.Arrays;

/**
 * Created by Smaug on 21.09.2016.
 */
public class Test_2016_09_21_Сортировки {
    private static void main(String[] args) {
        // Перестановка массива
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println("Перестановка элементов массива");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(data));
        fromCenterToBarrier(data);
        System.out.println();

        // Сортировка массива
        int[] massive = {10, 60, 80, 30, 20, 40, 50, 70, 90, 0};
        int barrier = massive.length;
        System.out.println("Сортировка пузырьком элементов массива");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(massive) + " Длина массива: " + barrier);
        //Сортировка пузырьком
        bubbleSorting(massive);
        System.out.println("Итоговый массив:");
        System.out.println(Arrays.toString(massive) + " Длина массива: " + barrier);
        System.out.println();

        //Сортировка выборкой
        int[] massive2 = {10, 60, 80, 30, 20, 40, 50, 70, 90, 0};
        barrier = massive2.length;
        System.out.println("Сортировка Выборкой элементов массива");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(massive2) + " Длина массива: " + barrier);
        selectionSorting(massive2);
        System.out.println("Итоговый массив:");
        System.out.println(Arrays.toString(massive2) + " Длина массива: " + barrier);

        //Сортировка обратной выборкой
        int[] massive3 = {10, 60, 80, 30, 20, 40, 50, 70, 90, 0};
        barrier = massive3.length;
        System.out.println("Сортировка Выборкой элементов массива");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(massive3) + " Длина массива: " + barrier);
        selectionReverseSorting(massive3);
        System.out.println("Итоговый массив:");
        System.out.println(Arrays.toString(massive3) + " Длина массива: " + barrier);


    }

    private static void selectionReverseSorting(int[] data) {
        for (int barrier = data.length; barrier > 0; barrier--) {
            for (int index = barrier - 1; index > 0; index--) {
                if (data[barrier] > data[index]) {
                    int temp = data[index];
                    data[index] = data[barrier];
                    data[barrier] = temp;
                }
            }
        }
    }

    private static void selectionSorting(int[] data) {
        for (int barrier = 0; barrier < data.length - 1; barrier++){
            for (int index = barrier + 1; index < data.length; index++){
                if (data[barrier] > data[index]){
                    int    temp = data[index];
                    data[index] = data[barrier];
                    data[barrier] = temp;

                }
            }
        }
    }

    private static void bubbleSorting(int[] data) {
        for (int barrier = data.length - 1; barrier > 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (data[index] > data[index +1])
                    swap2(data, index );
                System.out.print(index);
            }
            System.out.println();
        }
    }

    // перестановка элементов массива, от центра к краям
    private static void fromCenterToBarrier(int[] data) {
        int i = 0, j = 0;
        if (data.length % 2 != 0) {
            i = data.length / 2 - 1;
            j = data.length / 2 + 1;
        } else {
            i = data.length / 2 - 1;
            j = data.length / 2;
        }
        // определение центрального элемента
        System.out.println("i:" + i + " j:" + j);
        // перестановка
        //while (i >= 0) {      // используем WHILE
        for (; i >= 0; i--) {  // то же самое, но с FOR
            swap(data, i);
            //  i--;
        }
        //вывод итогового массива
        System.out.println("Итоговый массив:");
        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] data, int i) {
        int temp = 0;
        temp = data[i];
        data[i] = data[data.length - 1 - i];
        data[data.length - 1 - i] = temp;
    }
    private static void swap2(int[] data, int i) {
        int temp = data[i];
        data [i] = data[i+1];
        data[i+1] = temp;
        }

}
