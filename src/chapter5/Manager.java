package chapter5;

import chapters1to4.testPackage.Employee;

public class Manager extends Employee {
    private double bonus = 25;

    public Manager(String name) {
        super(name);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    @Override
    public String getDescription() {
        return "a mf MANAGER with " + (super.getSalary() + this.bonus) + "USD salary";
    }
}
