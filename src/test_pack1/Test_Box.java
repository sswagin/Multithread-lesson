package test_pack1;

import java.util.TreeMap;

/**
 * Created by Smaug on 26.09.2016.
 */
public class Test_Box {
    public final int width;
    public final int height;

    private static int counterOfBoxes = 0;
    // ключевое слово final используется для определения переменной один раз.
    public static final String MATERIAL = "PAPER";
    public static final String TAG   = Test_Box.class.toGenericString();
    int lenght;

    {   //блок инициализации

    }
    static    {   // статический блок инициализации

    }

    // Модификаторы доступа, 4 шт.
    //public - виден за пределами package
    //protected
    //private - виден только в пределах класса
    //   - empty - виден только в  пределах package

    //Сделаем конструктор
    public Test_Box() {
        counterOfBoxes++;

        this.height = 1;
        this.width = 2;
    }

    private void incrCountOfBoxes() {

    }

    public static int getCounterOfBoxes() {
        return counterOfBoxes;
    }

    public Test_Box(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void showVolume() {
        System.out.println("Box Volume is: " + calculateVolume(width, height, lenght));
    }

    // этот метод невидим снаружи.
    private int calculateVolume(int a, int b, int c) {
        int res = 0;
        return res = a * b * c;
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

