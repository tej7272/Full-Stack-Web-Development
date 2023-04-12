package Basic;

import java.util.Scanner;

public class PrimeNumberCount {
    static void CountOfPrimeNumber(int n){
        for(int i = 2;i<=n;i++){
            int flag=0;
            for(int j = 2;j<=i/2;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CountOfPrimeNumber(n);
    }
}
