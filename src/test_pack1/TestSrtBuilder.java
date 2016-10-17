package test_pack1;

/**
 * Created by Smaug on 12.09.2016.
 */
public class TestSrtBuilder {
    private static void main(String[] args) {
        StringBuilder newStr = new StringBuilder();
        newStr = newStr.append("This is newStr: ");
        newStr = newStr.append(45.34*34.23);
        newStr = newStr.append("Tabulated");
        newStr.appendCodePoint(90);

        System.out.println(newStr);
        System.out.println(newStr.length());
        System.out.println("\n");
        int strlength = newStr.length() / 2;

        String halfString = newStr.substring(strlength);
        System.out.println(halfString);
        System.out.println(halfString.length());

        for (int i = 90; i <= 200; i++) {
            newStr.appendCodePoint(i);
        }
        System.out.println(newStr);
        System.out.println(newStr.length());

        System.out.println("\n");
        String bufStr = "abcdqwe";
        System.out.println(bufStr.compareTo("abc"));

        System.out.println("comparing Srtings:");

        String str1 = new String ("asd");
        String str2 = new String ("asd");
        boolean resul = (str1 == str2);
        boolean resul2 = str1.equals(str2);
        System.out.println(resul);
        System.out.println(resul2);


    }
}
