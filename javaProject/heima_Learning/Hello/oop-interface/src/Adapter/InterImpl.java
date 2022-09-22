package Adapter;

public class InterImpl extends InterAdapter {
    @Override
    public void method5() {
        super.method5();
        System.out.println("We only need the method5!");
    }
}
