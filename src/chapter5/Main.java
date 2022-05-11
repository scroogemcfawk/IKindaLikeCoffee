package chapter5;

import chapters1to4.testPackage.Employee;

/**
 * Take that shit out
 * @since 10 May 2022
 * @author scroogio
 */
public class Main {
    public static void main(String[] args) {
        var boss = new Manager("Stepan Bylkov");
        boss.setBonus(150);
        System.out.println(boss.getSalary());
        var ppl = new Person[3];
        ppl[0] = new Student("Vassili Poopkin", "Anal fisting");
        ppl[1] = new Employee("Tim Marshall");
        ppl[2] = boss;

        for (var p : ppl) {
            System.out.println(p.getDescription() + " " + (p instanceof Manager));
        }
    }
}
