package Array;

import java.util.Scanner;

public class minimumAdjacentDifference {
    static int minimumAdjacentDifferenceInArray(int[] arr){
        int minDiff =Integer.MAX_VALUE;
        int n = arr.length;

        for(int i = 1;i<n;i++){
            minDiff = Math.min(minDiff,Math.abs(arr[i]-arr[i-1]));
        }
        minDiff = Math.min(minDiff,Math.abs(arr[0]-arr[n-1]));
        return minDiff;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(minimumAdjacentDifferenceInArray(arr));
        
    }
}
