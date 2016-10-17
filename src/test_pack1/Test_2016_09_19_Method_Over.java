package test_pack1;

/**
 * Created by Smaug on 19.09.2016.
 */
public class Test_2016_09_19_Method_Over {
    private static void main(String[] args) {
        // Перегрузка методов
        //
        //
        int two = 50;
        double one = 67.345;
        int three = 123;
        int four = 34;

        System.out.println(math(one, two));
        System.out.println(math());
        System.out.println(math2(four, three));
    }

    public static int math(int a, int b) {
        return a + b;
    }


    public static double math(double a, double b) {
        return a + b;
    }

    public static double math(int a, double b) {
        return a + b;
    }

    public static double math(double a, int b) {
        return a + b;
    }

    public static String math() {
        String str = "no numbers";
        return str;
    }

    public static String math2(int a, int b) {
        if (b == 0) {
            String msg = "Zero division is not allowed";
            return msg;

        } else {
            String result = "Целая часть: " + String.valueOf(a / b) + "   Дробная часть: " + String.valueOf(a % b);
            return result;
        }

    }
}