package GeeksForGeeks;

import java.util.TreeSet;
public class ClosestGreaterVal {
    public static void closestGreater(int[] arr) {
        // Insert all array elements into a TreeSet
        TreeSet<Integer> ts = new TreeSet<Integer>();
        for (int i = 0; i < arr.length; i++)
            ts.add(arr[i]);
            // Find smallest greater element for every
            // array element
            for (int i = 0; i < arr.length; i++) {
                Integer greater = ts.higher(arr[i]);
                if (greater == null) {
                    System.out.print(-1 + " ");
                }
                else {
                    System.out.print(greater + " ");
                }
            }
        }
        public static void main(String[] args) {
        int[] arr = { 10, 5, 11, 10, 20, 12};
        closestGreater(arr);
        }
    }
