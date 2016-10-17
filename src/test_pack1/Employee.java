package test_pack1;

/**
 * Created by Smaug on 28.09.2016.
 */
public class Employee extends Human {    //наследование от Human

    public Employee() {
        System.out.println("Employee constructor");
    }

    public void work() {
        System.out.println("Work!");
    }

    @Override
    public String getInfo() {
        System.out.println(super.getInfo());
        return "info employee";
    }
}
