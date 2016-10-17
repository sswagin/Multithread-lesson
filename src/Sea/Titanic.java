package Sea;

/**
 * Created by Smaug on 28.09.2016.
 */
public class Titanic {

    public void crash(){
        Boat boat1 = new Boat();
        Boat boat2 = new Boat();
        Boat boat3 = new Boat();
        Boat boat4 = new Boat();
        boat1.capacity = 1;
        boat2.capacity = 5;
        boat3.capacity = 6;
        boat4.capacity = 9;
        System.out.println("Titanic Boat1 capacity: " + boat1.capacity);
        System.out.println("Titanic Boat2 capacity: " + boat2.capacity);
        System.out.println("Titanic Boat3 capacity: " + boat3.capacity);
        System.out.println("Titanic Boat4 capacity: " + boat4.capacity);

    }

    private static class Boat {
        private int capacity = 0;
    }
}
