package GeeksForGeeks;
public class MaxOnes {
    static final int N = 4;
    static void findMax(int arr[][]) {
        int row = 0, i, j;
        for (i = 0, j = N - 1; i < N; i++) {
            // find left most position of 1 in a row
            // find 1st zero in a row
            while (j >= 0 && arr[i][j] == 1) {
                row = i;
                j--;
            }
        }
        System.out.print("Row number = " + (row + 1));
        System.out.print(", MaxCount = " + (N - 1 - j));
    }
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0, 1},
                       {0, 0, 0, 1},
                       {0, 0, 0, 0},
                       {0, 1, 1, 1}};
        findMax(arr);
    }
}
