package test_pack1;

import java.util.Scanner;

/**
 * Created by Smaug on 14.09.2016.
 */
public class HomeWork1409 {
    private static void main(String[] args) {

        System.out.println("Enter string here:");
        String str = readStringFromConsole();
        System.out.println(str);



    }

    private static String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

}
