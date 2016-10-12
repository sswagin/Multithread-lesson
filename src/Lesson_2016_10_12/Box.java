package Lesson_2016_10_12;

/**
 * Created by Smaug on 12.10.2016.
 */
public class Box {
    private int length;
    private int height;
    private int width;

    public Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }
    @Override
    public String toString(){
        return "height = " + height + "length = " + length + "width = " + width;
    }

    @Override
    public boolean equals(Object o) {
        Box other = (Box)o;
        return this.width == other.width &&
                this.length == other.length &&
                this.height == other.height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
