package Sea;

/**
 * Created by Smaug on 28.09.2016.
 */
public class Ark {
    public void go(){
        Paddle paddle1 = new Paddle ();
        Paddle paddle2 = new Paddle ();
        paddle1.length = 3;
        paddle2.length = 3;

        System.out.println("Ark paddle1: " + paddle1.length);
        System.out.println("Ark paddle2: " + paddle2.length);

    }

    private static class Paddle {
        private int length = 0;
    }
}
