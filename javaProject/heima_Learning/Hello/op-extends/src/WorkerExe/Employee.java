package WorkerExe;

public class Employee {
    private String id;
    private String name;
    private double wage;

    public Employee() {
    }

    public Employee(String id, String name, double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }

    public void work() {
        System.out.println("working");
    }

    public void eat() {
        System.out.println("eating");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

}
