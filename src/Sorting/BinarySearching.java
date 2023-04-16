package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearching {
    static int getElementByLinearSearching(int[] arr,int el){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el){
                return i;
            }
        }
        return -1;
    }
    static int getElementByBinarySearching(int[] arr,int el){
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==el){
                return mid;
            }
            else if(arr[mid]>el){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        //it will return low of nearest element if the el isn't exits;
        return low;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int el = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(getElementByLinearSearching(arr,el));
        System.out.println(getElementByBinarySearching(arr,el));
    }
}
