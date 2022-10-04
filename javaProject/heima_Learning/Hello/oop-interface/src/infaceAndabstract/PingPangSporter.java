package infaceAndabstract;

public class PingPangSporter extends Sporter implements SpeakEnglish {

    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("Pingpang sporter can speak english");
    }

    @Override
    public void study() {
        System.out.println("Pingpang sporter is learning pingpang");
    }


}
