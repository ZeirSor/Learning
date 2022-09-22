package src.reptile;

public class RepileTest5 {
    public static void main(String[] args) {
        String s = "喜羊羊jas90834ur9023ur9灰太狼h2893her238h89dfhjwd9沸羊羊";

        String regex1 = "[\\w&&[^_]]+";
        System.out.println(s.replaceAll(regex1, "vs"));

        for (String x: s.split(regex1))
            System.out.println(x);
    }
}
