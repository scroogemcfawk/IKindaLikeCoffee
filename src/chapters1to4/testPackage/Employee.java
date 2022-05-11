package chapters1to4.testPackage;
import java.time.LocalDate;
import chapter5.Person;

/**
 * Ну и хуйня
 */
public class Employee extends Person {
    private double salary = 7.25D;
    private LocalDate hireDay;

    public Employee() {}

    public Employee(String name) {
        super(name);
    }

    public Employee(int yyyy) {
        this(1, 1, yyyy);
    }

    public Employee(int dd, int mm, int yyyy) {
        this.hireDay = LocalDate.of(yyyy, mm, dd);
    }

    /**
     *
     * @param name first name and last name
     * @param salary salary in USD
     * @param dd day
     * @param mm month
     * @param yyyy year of hire
     */
    public Employee(String name, double salary, int dd, int mm, int yyyy) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(yyyy, mm, dd);
    }

    public void raiseSalary(int perc) {
        this.salary *= (double) perc / 100D;
    }

    public double getSalary() {
        return this.salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getDescription() {
        return "an Employee with " + this.salary + "USD salary";
    }

    @Override
    public String toString() {
        return super.toString() + "[salary=" + this.salary + ",hireDay=" + this.hireDay + "]";
    }
}
