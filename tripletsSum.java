package GeeksForGeeks;
import java.util.HashSet;
class tripletsSum {
    static void findTriplets(int arr[], int n, int sum) {
        for (int i = 0; i < n - 1; i++) {
            // Find all pairs with sum equals to "sum-arr[i]"
            HashSet<Integer> s = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int x = sum - (arr[i] + arr[j]);
                if (s.contains(x))
                    System.out.printf("%d %d %d\n", x, arr[i], arr[j]);
                else
                    s.add(arr[j]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int sum = -2;
        int n = arr.length;
        findTriplets(arr, n, sum);
    }
}