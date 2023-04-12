package Basic;

import java.util.Scanner;

public class ArmstrongNumber {
    static boolean armstrongNumber(int n){
        int temp = n;
        int sum = 0;
        while(n > 0){
            sum = sum + (n%10)*(n%10)*(n%10);
            n = n/10;
        }
        if(temp != sum){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(armstrongNumber(n)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
