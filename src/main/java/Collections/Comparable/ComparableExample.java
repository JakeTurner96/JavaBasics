package Collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList();

        list.add(new Employee("Adam", "Graphic designer", 420));
        list.add(new Employee("Dan", "Recruitment", 12));
        list.add(new Employee("Connor", "Sales", 44));
        list.add(new Employee("Ed", "Project manager", 109));
        list.add(new Employee("Ben", "Software developer", 233));

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
