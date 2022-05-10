package chapter5;

import chapters1to4.testPackage.Employee;

public class Manager extends Employee {
    private double bonus = 25;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }
}
