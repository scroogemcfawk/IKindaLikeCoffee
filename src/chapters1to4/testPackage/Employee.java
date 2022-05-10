package chapters1to4.testPackage;
import java.time.LocalDate;

/**
 * Ну и хуйня
 */
public class Employee {
    private String name = "unknown";
    private double salary = 7.25D;
    private LocalDate hireDay;

    public Employee() {
    }

    public Employee(String n) {
        name = n;
    }

    public Employee(int yyyy) {
        this(1, 1, yyyy);
    }

    public Employee(int dd, int mm, int yyyy) {
        hireDay = LocalDate.of(yyyy, mm, dd);
    }

    /**
     *
     * @param n first name and last name
     * @param s salary in USD
     * @param dd day
     * @param mm month
     * @param yyyy year of hire
     */
    public Employee(String n, double s, int dd, int mm, int yyyy) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(yyyy, mm, dd);
    }

    public void raiseSalary(int perc) {
        salary *= (double) perc / 100D;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setSalary(double s) {
        salary = s;
    }
}
