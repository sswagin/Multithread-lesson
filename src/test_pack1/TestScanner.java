package test_pack1;

import java.util.Scanner;

/**
 * Created by Smaug on 12.09.2016.
 */
public class TestScanner {
    private static void main(String[] args) {

        System.out.println("Enter int here:");
        int orii = readIntFromConsole();
        System.out.println(orii);

        System.out.println("Enter string here:");
        String str = readStringFromConsole();
        System.out.println(str);


    }

    private static int readIntFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

}
