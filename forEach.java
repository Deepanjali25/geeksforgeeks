package GeeksForGeeks;

public class forEach {
    public static void main(String[] arg) {
        int[] marks = { 125, 132, 95, 116, 110 };
        int highest_marks = maximum(marks);
        System.out.println("The highest score is " + highest_marks);
    }
    public static int maximum(int[] numbers) {
        int maxSoFar = numbers[0];
        for (int num : numbers) {
            System.out.println("num is " + num + " numbers is " + numbers );
            if (num > maxSoFar) {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
}
