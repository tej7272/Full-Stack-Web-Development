package Sorting;

import java.util.Scanner;

public class InsertionSort2 {
    static void IntsertionSortng(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();

        IntsertionSortng(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
