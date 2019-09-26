package GeeksForGeeks;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;
public class SimpleQueries {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<Q; i++){
            int first = in.nextInt();
            int second = in.nextInt();
            int third = 0;
            if(first!=3)
                third = in.nextInt();
            if(first == 1){
                int l = second - 1;
                int r = third - 1;
                int mul = 1, count=0;
                for(int j=l; j<r; j++){
                    if(arr[j] <= arr[j+1]){
                        count++;
                        mul = mul * arr[j];
                        continue;
                    }
                    else break;
                }
                mul = mul * arr[count+l];
                System.out.println(mul);
            }
            else if(first == 2){
                arr[second-1] = third;
            }
            else if(first == 3){
            }
                else if (first == 4){
                    if(true){
                        //......
                    }
                    else{
                    }
                }
                else if (first == 5){
                }
        }
    }
}
