package Lesson_2016_10_05;

/**
 * Created by Smaug on 05.10.2016.
 */
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Animal pet;
        pet = new Dog();
        pet.voice();
        pet.love();

        pet = new Cow();
        pet.love();
        pet.voice();

        Cow cow2 = new Cow();

        Farm farm = new Farm();
        farm.feef(cow2);
        System.out.println(cow2.MAX_MASS);


        new Animal(){
//            @Override
//            public void eat() {
//
//            }

            @Override
            public void love (){
                System.out.println("Pet loves you");
            }

            @Override
            public void voice() {
                System.out.println("WatchDog!");
            }
        }.voice();




    }

}

