package infaceAndabstract;

public class Test {
    public static void main(String[] args) {
        PingPangCoach ppc = new PingPangCoach("ppc", 25);
        ppc.teach();
        ppc.speakEnglish();
        System.out.println(ppc.toString());

        PingPangSporter pps = new PingPangSporter("pps", 26);
        pps.study();
        pps.speakEnglish();
        System.out.println(pps.toString());

        BasketballCoach bbc = new BasketballCoach("bbc", 25);
        bbc.teach();
        System.out.println(bbc.toString());

        BasketballSporter bbs = new BasketballSporter("bbs", 27);
        bbs.study();
        System.out.println(bbs.toString());

    }
}
