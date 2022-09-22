package WorkerExe;

public class Manager extends Employee {
    private double bonus;

    public Manager() {
    }

    public Manager(String id, String name, double wage, double bonus) {
        super(id, name, wage);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("manage other people");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
