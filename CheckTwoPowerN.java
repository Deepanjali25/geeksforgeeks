package GeeksForGeeks;

class CheckTwoPowerN {
    static boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
    public static void main(String args[]) {
        if (isPowerOfTwo(6))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (isPowerOfTwo(64))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}