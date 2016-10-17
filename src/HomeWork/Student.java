package HomeWork;

/**
 * Created by Smaug on 03.10.2016.
 */
public class Student extends Man {
    protected int study_year;

    public void createStudent(){
        Student student4 = new Student();
        student4.setName("Delta");
        student4.setAge(20);
        student4.setSex("Female");
        student4.setStudy_year(2016);
        System.out.println("Name: " + student4.getName() + " Age: " + student4.getAge() + " Sex: " + student4.getSex() + " Year: " + student4.getStudy_year());
    }

    public int getStudy_year() {
        return study_year;
    }

    public void setStudy_year(int study_year) {
        this.study_year = study_year;
    }
}
