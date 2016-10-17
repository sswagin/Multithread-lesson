package test_pack1;

/**
 * Created by Smaug on 07.09.2016.
 */
public class TestClass1 {
    private static void main(String[] args) {
        int first = 115;
        int second = 12;


        newFunction(first, second);
    }

    private static void newFunction(int a, int b) {
        System.out.println(a > b ? a : b);
        System.out.println();
        System.out.println();
        System.out.println("a = [" + a + "], b = [" + b + "]");
        System.out.println("TestClass1.newFunction");
        System.out.println("b = " + b);


    }


}
