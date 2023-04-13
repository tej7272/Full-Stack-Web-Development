package Sorting;

import java.util.Scanner;


public class BubbleSort1 {
    static void BubbleSorting(int[] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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

        BubbleSorting(arr);
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
