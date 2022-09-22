package infaceAndabstract;

public class PingPangCoach extends Coach implements SpeakEnglish {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("Pingpong coach is teaching pingpong");
    }

    @Override
    public void speakEnglish() {
        System.out.println("Pingpong coach is speaking english");
    }
}
