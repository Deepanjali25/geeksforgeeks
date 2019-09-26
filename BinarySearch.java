package GeeksForGeeks;
// Java implementation of recursive Binary Search
public class BinarySearch {
    // Returns index of x if it is present in arr[], else return -1
    int binarySearch(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;
            // If element is smaller than mid, then it can only be present in left sub array
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);
            // Else the element can only be present in right sub array
            return binarySearch(arr, mid + 1, right, x);
        }
        // We reach here when element is not present in array
        return -1;
    }
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
        System.out.println(arr.length);
    }
}
// Java implementation of iterative Binary Search
// class BinarySearch {
// Returns index of x if it is present in arr[],
// else return -1
//   int binarySearch(int arr[], int x)
// {
//    int left = 0, right = arr.length - 1;
//   while (left <= right) {
//            int mid = left + (right - left) / 2;
        // Check if x is present at mid
//            if (arr[mid] == x)
//                return mid;
            // If x greater, ignore left half
//            if (arr[mid] < x)
//                left = mid + 1;
                // If x is smaller, ignore right half
//            else
//                right = mid - 1;
//        }
        // if we reach here, then element was
        // not present
//        return -1;
//    }
//    public static void main(String args[])
//    {
//        BinarySearch ob = new BinarySearch();
//        int arr[] = { 2, 3, 4, 10, 40 };
//        int n = arr.length;
//        int x = 10;
//        int result = ob.binarySearch(arr, x);
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at " + "index " + result);
//    }
//}
