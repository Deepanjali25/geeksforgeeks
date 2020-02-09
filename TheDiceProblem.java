import java.util.Scanner;
public class TheDiceProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 1; i <=t ; i++) {
            int n = scanner.nextInt();
            if (n==1) {
                System.out.println(6);
            }
            else if (n==2) {
                System.out.println(5);
            }
            else if (n==3) {
                System.out.println(4);
            }
            else if (n==4) {
                System.out.println(3);
            }
            else if (n==5) {
                System.out.println(2);
            }
            else if (n==6) {
                System.out.println(1);
            }
        }
    }
}
