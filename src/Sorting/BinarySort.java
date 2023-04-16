package Sorting;

import java.util.Scanner;

public class BinarySort {
    static void BinarySorting(int[] arr){
        int i = 0,j=arr.length-1;
        while(i<j){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                i++;
            }
            else{

            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();

        BinarySorting(arr);

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
