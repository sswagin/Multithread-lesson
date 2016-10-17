package test_pack1;

/**
 * Created by Smaug on 26.09.2016.
 */
public class Test_2016_09_26_Классы_и_объекты {
    private static void main(String[] args) {
        Test_Box box = new Test_Box(5, 8);
        //    Test_Box box = new Test_Box();
        box.lenght = 9;

//        box.width = 12;   //нельзя изменить переменную final
        // все переменные передаются по значению,
        // все объекты передаются по ссылке
        Test_Box box1 = new Test_Box(5, 6);
        Test_Box box2 = new Test_Box(5, 6);
        Test_Box box3 = new Test_Box(10, 12);
        Test_Box box4 = box1;

        Test_Box.getCounterOfBoxes();

        Object box6 = new Test_Box();
        System.out.println(box6.hashCode());

        if (box6 instanceof Test_Box){
            System.out.println("It's a box!!!");
        }

        System.out.println(box1 == box4); // true, т.к. box1 и box4 указывают на один объект.

        System.out.println("Public length: " + box.lenght);
        System.out.println("Priv height: " + box.getHeight());
        System.out.println("Priv widtht: " + box.getWidth());

        box.showVolume();

        System.out.println("Создаём коробки ");
        for (int i = 0; i < 5; i++){
            new Test_Box();
        }
        Test_Box box5 = new Test_Box();
        System.out.println("Количество коробок: " + box.getCounterOfBoxes());
        System.out.println("Материал коробок: " + box.MATERIAL);
        System.out.println("Tag: " + box.TAG);

    }

}
