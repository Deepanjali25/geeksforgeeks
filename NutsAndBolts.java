package GeeksForGeeks;
import java.util.Arrays;
import java.util.HashMap;
public class NutsAndBolts {
    public static void match(char nuts[], char bolts[]) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < nuts.length; i++) {
            map.put(nuts[i], i);
        }
        for (int i = 0; i < bolts.length; i++) {
            char bolt = bolts[i];
            if (map.containsKey(bolt)) {
            nuts[i] = bolts[i];
            } else {
            System.out.println("for bolt " + bolt + "no nut is present");
            return;
            }
        }
        System.out.println("(Hash Map) Matched nuts and bolts are-");
        System.out.println(Arrays.toString(nuts));
        System.out.println(Arrays.toString(bolts));
    }
    public static void main(String[] args) {
        char nuts[] = {'@', '#', '$', '%', '^', '&'};
        char bolts[] = {'$', '%', '&', '^', '@', '#'};
        int n = nuts.length / nuts[0];
        match(nuts, bolts);
    }
}
