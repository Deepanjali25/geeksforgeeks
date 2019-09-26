package GeeksForGeeks;
public class MaxAbsDiff {
    private static int calculateDiff(int i, int j, int[] array) {
        return Math.abs(array[i] - array[j]) + Math.abs(i - j);
    }
    private static int maxDistance(int[] array) {
        // Variable for storing the maximum absolute distance throughout the traversal of loops.
        int result = 0;
        // Iterate through all pairs.
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                // If the absolute difference of current pair (i, j) is greater than the maximum difference
                // calculated till now, update the value of result.
                result = Math.max(result, calculateDiff(i, j, array));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = { -70, -64, -6, -56, 64, 61, -57, 16, 48, -98 };
        System.out.println(maxDistance(array));
    }
}