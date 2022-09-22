package WorkerExe;

public class Cook extends Employee {
    public Cook() {
    }

    public Cook(String id, String name, double wage) {
        super(id, name, wage);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("cooking");
    }


}
