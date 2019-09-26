package GeeksForGeeks;
class Median {
    static float findmedian(int a[], int n1, int b[], int n2) {
        int i = 0; /* Current index of i/p array a[] */
        int j = 0; /* Current index of i/p array b[] */
        int k;
        int m1 = -1, m2 = -1;
        for (k = 0; k <= (n1 + n2) / 2; k++) {
            if (i < n1 && j < n2) {
                if (a[i] < b[j]) {
                    m2 = m1;
                    m1 = a[i];
                    i++;
                }
                else {
                    m2 = m1;
                    m1 = b[j];
                    j++;
                }
            }
            else if (i == n1) {
                m2 = m1;
                m1 = b[j];
                j++;
            }
            else if (j == n2) {
                m2 = m1;
                m1 = a[i];
                i++;
            }
        }
        if ((n1 + n2) % 2 == 0) {
            return (m1 + m2) * (float) 1.0 / 2;
        }
        return m1;
    }
    public static void main (String[] args) {
        int a[] = {1, 12, 15, 26, 38 };
        int b[] = {2, 13, 24};
        int n1 = a.length;
        int n2 = b.length;
        System.out.println( findmedian(a, n1, b, n2));
    }
}