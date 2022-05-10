package chapters1to4;

import chapters1to4.testPackage.Employee;
import chapter5.*;

/**
 * Я сосал меня ебали <br>
 * {@code int main(int argc, char** argv) {}} - хуйня из C++ (категорически не рекомендую)<br>
 * Купил мужчина <em>шляпу</em>, а она ему <strong>как раз</strong>.
 * {@index vagina}
 * <ul>
 *     <li>вагина</li>
 *     <li>пенис</li>
 * </ul>
 * <img src="../../doc-files/note.jpg" alt="doc note"></img></br>
 * @see "Penis?"
 * @see chapters1to4.testPackage.Employee
 * @author scroogemcfawk
 */

public class TestClass {
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        arr[0] = new Employee("Stepanbek Bylkombetov", 15D, 31, 5, 2022);
        arr[1] = new Employee("Arina Shodina", 15D, 15, 5, 2022);
        arr[2] = new Employee(2002);

//        for (var e : arr) {Manifest-Version: 1.0
//            System.out.println(e.getName() + " " + e.getSalary());
//            e.setSalary(5D);
//            System.out.println(e.getName() + " " + e.getSalary());
//            e.raiseSalary(450);
//            System.out.println(e.getName() + " " + e.getSalary());
//        }
        arr[0].getName().toLowerCase();
        System.out.println(arr[0].getName() + " " + arr[0].getSalary());
        System.out.println(arr[2].getName() + " " + arr[2].getSalary() + " " + arr[2].getHireDay());
    }
}

