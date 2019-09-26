package GeeksForGeeks;
public class MaxOnesInRow {
    static int R = 4, C = 4;
    static int first(int arr[], int low, int high) {      // Function to find the index of first index of 1 in a boolean array arr[]
        if (high >= low) {
            int mid = low + (high - low) / 2;                         // Get the middle index
            if ((mid == 0 || (arr[mid - 1] == 0)) && arr[mid] == 1)   // Check if the element at middle index is first 1
                return mid;
            else if (arr[mid] == 0)                                   // If the element is 0, recur for right side
                return first(arr, (mid + 1), high);
            else                                                      // If element is not first 1, recur for left side
                return first(arr, low, (mid - 1));
        }
        return -1;
    }
    static int rowWithMax1s(int mat[][]) { // Function that returns index of row with maximum number of 1s
        int max_row_index = 0, max = -1;   // Initialize max values
        int i, index;
        for (i = 0; i < R; i++) {         // Traverse for each row and count number of 1s by finding the index of first 1
            index = first(mat[i], 0, C - 1);
            if (index != -1 && C - index > max) {
                max = C - index;
                max_row_index = i;
            }
        }
        return max_row_index;
    }
    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 0, 1 },
                        { 0, 1, 1, 1 },
                        { 1, 1, 1, 1 },
                        { 0, 0, 0, 0 } };
        System.out.println("Index of row with maximum 1s is " + rowWithMax1s(mat));
    }
}
