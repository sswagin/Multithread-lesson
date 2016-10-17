package HomeWork;



/**
 * Created by Smaug on 03.10.2016.
 */
public class Man {
    public Man() {
        System.out.println("Man entity created!");
    }

    protected String name;
    protected int age;
    protected String sex;
    protected int weight;
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";


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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
