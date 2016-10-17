package Lesson_2016_10_05;

/**
 * Created by Smaug on 05.10.2016.
 */
 public abstract class Animal {
        protected String name;


        public abstract void voice();
        public abstract void love();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

