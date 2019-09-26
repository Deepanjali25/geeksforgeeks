package GeeksForGeeks;
import java.util.*;

import static java.util.Comparator.comparingInt;
public class kMostOccur {
    public List<Integer> topkFrequent(int[] num, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int n = num[i];
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(comparingInt(count::get));
        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        List<Integer> top_k = new LinkedList<>();
        while(!heap.isEmpty()) {
            top_k.add(heap.poll());
            Collections.reverse(top_k);
        }
        return top_k;
    }
}
