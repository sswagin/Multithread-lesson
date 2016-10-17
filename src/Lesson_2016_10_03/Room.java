package Lesson_2016_10_03;

/**
 * Created by Smaug on 03.10.2016.
 */
public class Room {
    protected final int numberOfWindows;
    protected int numberOfDoors;


    public Room(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = 1;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public static void main(String[] args) {
        Room room1 = new BigRoom(5);
        System.out.println("numer of doors " + room1.numberOfDoors + " number of windows " + room1.numberOfWindows);
    }
}
