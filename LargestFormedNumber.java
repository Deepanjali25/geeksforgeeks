package GeeksForGeeks;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class LargestFormedNumber {
    public String largestNumber(final List<Integer> list) {
        List<String> copy = list.stream().map(String::valueOf).collect(Collectors.toList());
        Collections.sort(copy, new Comparator<String>(){
            @Override
            public int compare(String X, String Y) {
                String XY = X + Y;
                String YX = Y + X;
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
        StringBuilder sb = new StringBuilder("");
        for (String s : copy) {
            sb.append(s);
        }
        return sb.toString().charAt(0) == '0' ? "0" : sb.toString();
    }
    public static void main(String[] args) {

    }
}
