package Sorting;

import java.util.Scanner;


public class InsertionSort1 {
    static void InsertionSorting(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1] = temp;
            j=j-1;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        InsertionSorting(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
