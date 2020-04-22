package Collections.Comparable;

public class Employee implements Comparable<Employee>{
    String name;
    String role;
    int id;

    public Employee(String name, String role, int id) {
        this.name = name;
        this.role = role;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        return this.name.compareTo(e.getName());
    }
}
