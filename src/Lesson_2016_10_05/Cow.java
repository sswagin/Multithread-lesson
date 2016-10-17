package Lesson_2016_10_05;

/**
 * Created by Smaug on 05.10.2016.
 */

    public class Cow extends Animal implements Eatable{

      @Override
      public void eat(){
          System.out.println("Cow must eat!");
      }
        @Override
        public void voice() {
            System.out.println("Mooo");
        }

      //  @Override
        public void love( ){
            System.out.println("I love you " + Cow.class.getSimpleName());
        }
    }

