package Basic;

import java.util.Scanner;

public class primeNumber {
    static int flag = 0;
    static void PrimeNumber(int n){
        if(n==0||n==1){
            System.out.println("no");
        }
        else{
        for(int i = 2;i<=n/2;i++) {
            if (n % i == 0) {
                System.out.println("no");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("yes");
        }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeNumber(n);
    }
}
