package GeeksForGeeks;
// Java program to find largest rectangle with all 1s in a binary matrix
import java.util.Stack;
class MaximalRect {
    static int maxHist(int R,int C,int row[]) {       // The stack holds indexes of hist[] array
        Stack<Integer> result = new Stack<Integer>(); //The bars stored in stack are always in increasing order of their heights.
        int top_val;       // Top of stack
        int max_area = 0;  // Initialize max area in current row (or histogram)
        int area = 0;      // Initialize area with current top
        int i = 0;
        while (i < C) {          // Run through all bars of given histogram (or row)
            if (result.empty() || row[result.peek()] <= row[i])   // If this bar is higher than the bar on top stack, push it to stack
                result.push(i++);
            else {// If this bar is lower than top of stack, then calculate area of rectangle with stack top as
                //the smallest (or minimum height) bar. 'i' is 'right index' for the top and element before top in stack is 'left index'
                top_val = row[result.peek()];
                result.pop();
                area = top_val * i;
                if (!result.empty())
                    area = top_val * (i - result.peek() - 1 );
                max_area = Math.max(area, max_area);
            }
        }// Now pop the remaining bars from stack and calculate area with every popped bar as the smallest bar
        while (!result.empty()) {
            top_val = row[result.peek()];
            result.pop();
            area = top_val * i;
            if (!result.empty())
                area = top_val * (i - result.peek() - 1 );
            max_area = Math.max(area, max_area);
        }
        return max_area;
    }// Returns area of the largest rectangle with all 1s in A[][]
    static int maxRectangle(int R,int C,int A[][]) { // Calculate area for first row and initialize it as result
        int result = maxHist(R,C,A[0]);
        for (int i = 1; i < R; i++) {      // iterate over row to find maximum rectangular area considering each row as histogram
            for (int j = 0; j < C; j++)
                if (A[i][j] == 1) A[i][j] += A[i - 1][j];  // if A[i][j] is 1 then add A[i -1][j]
            result = Math.max(result, maxHist(R,C,A[i]));  // Update result if area with current row (as last row of rectangle) is more
        }
        return result;
    }
    public static void main (String[] args) {
        int R = 4;
        int C = 4;
        int A[][] = { {0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0}};
        System.out.print("Area of maximum rectangle is " +
                maxRectangle(R,C,A));
    }
}