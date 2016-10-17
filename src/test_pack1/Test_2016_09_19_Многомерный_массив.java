package test_pack1;

import java.util.Arrays;

/**
 * Created by Smaug on 19.09.2016.
 */
public class Test_2016_09_19_Многомерный_массив {
    private static void main(String[] args) {

        // Многомерные массивы

        String[][] data = new String[4][3];

        data[0][0] = "1";
        data[0][1] = "Игорь";
        data[0][2] = "066 666 66 66";

        data[1][0] = "2";
        data[1][1] = "Роман";
        data[1][2] = "063 633 36 63";

        data[2][0] = "3";
        data[2][1] = "Егор";
        data[2][2] = "095 959 59 59";

        data[3][0] = "4";
        data[3][1] = "Иван";
        data[3][2] = "099 999 99 99";

        System.out.println(Arrays.deepToString(data));


        int[][] arr = {{2, 3, 4, 5},
                {5, 6, 7}};

        System.out.println(Arrays.deepToString(arr));
        fillEx();

        // сделаем 2 массива даблов, сложим их и напечатаем
        double[] arr1 = new double[3];
        double[] arr2 = new double[5];
        Arrays.fill(arr1, 3.14);
        Arrays.fill(arr2, 9.12);

        System.out.println(Arrays.toString(concatDoubleArray(arr1, arr2)));
    }

    public static void fillEx() {
        int size = 4;
        boolean[] test1 = new boolean[size];
        int[] test2 = new int[size];
        String[] test3 = new String[size];
        Arrays.fill(test1, true);
        System.out.println(Arrays.toString(test1));

        Arrays.fill(test2, 9);
        System.out.println(Arrays.toString(test2));

        Arrays.fill(test3, "asd"); //заполнение массива одинаковыми данными
        Arrays.fill(test3, 2, 4, "qwe"); //вставка значения, начиная с элемента 1 и заканчивая 2, не включая 3.
        System.out.println(Arrays.toString(test3));

        String[][] table = new String[4][3];
        //Arrays.fill(table, "Eve");  //этот метод не работает с двухмерными массивами
        System.out.println(Arrays.deepToString(table));

    }
        //функция сложения двух массивов
    public static double [] concatDoubleArray(double[] firstData, double[] secondData ) {
        if (firstData == null)
            return secondData;
        if (secondData == null)
            return firstData;

        double [] result = new double[firstData.length + secondData.length];

        double [] result2 = new double[2];



//        аргументы System.arraycopy
//        var0 - исходный массив System.arraycopy
//        var1 - стартовая позиция в исходном массиве
//        var2 - исходный назначения
//        var3 - стартовая позиция данных в массиве назначения
//        var4 - количество элементов массива для копирования

        System.arraycopy(firstData, 0, result, 0, firstData.length);
        System.arraycopy(secondData, 0, result, firstData.length, secondData.length);
        return result;

    }
}
