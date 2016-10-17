package HomeWork;

import test_pack1.Human;

/**
 * Created by Smaug on 03.10.2016.
 */
public class HomeWork_2016_10_03 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("Alpha");
        student2.setName("Beta");
        student3.setName("Gamma");

        student1.setAge(18);
        student2.setAge(19);
        student3.setAge(20);

        student1.setSex("Male");
        student2.setSex("Male");
        student3.setSex("Female");

        student1.setStudy_year(2013);
        student2.setStudy_year(2014);
        student3.setStudy_year(2015);

        System.out.println("Name: " + student1.getName() + " Age: " + student1.getAge() + " Sex: " + student1.getSex() + " Year: " + student1.getStudy_year());
        System.out.println("Name: " + student2.getName() + " Age: " + student2.getAge() + " Sex: " + student2.getSex() + " Year: " + student2.getStudy_year());
        System.out.println("Name: " + student3.getName() + " Age: " + student3.getAge() + " Sex: " + student3.getSex() + " Year: " + student3.getStudy_year());
        student3.createStudent();
    }
}
