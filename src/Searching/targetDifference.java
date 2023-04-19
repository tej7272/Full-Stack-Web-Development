package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class targetDifference {
    static int BinarySearch(int[] arr,int low,int high, int a){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==a){
                return mid;
            }
            else if(arr[mid]>a){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    static boolean doesTargetDifferenceExits(int[] arr, int targetDiff){
        for(int i = 1;i<arr.length;i++){
            int b = arr[i];
            int a = b-targetDiff;
            if(BinarySearch(arr,0,i-1,a)!=-1){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int targetDiff = sc.nextInt();
        Arrays.sort(arr);

        if(doesTargetDifferenceExits(arr,targetDiff)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
