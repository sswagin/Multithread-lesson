package test_pack1;

/**
 * Created by Smaug on 28.09.2016.
 */
public class Human {
    public Human() {
        System.out.println("Human constructor");
    }

    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo (){
        return "Human age: " + age + " name: " + name; // protected даёт возможность обращаться напрямую, без геттеров
    }

@Override
    public boolean equals(Object o){
    if (o == null)
        return false;
    //    return super.equals(o); //изначальный вариант

    // ниже - измененный вариант
    Human another = (Human)o;


    return another.name.equals(this.name)
            && another.age == this.age;
}
}
