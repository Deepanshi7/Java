import java.util.Scanner;
public class sum {
    public static int sumOfN(int n) {
        if(n<0){
            System.out.println("give valid number");
            return 0;
        }
        else if(n==0){
            return 0;
        }
        else{
            return n + sumOfN(n-1);
        }

    }
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        System.out.println("the number :");
        int n = scn.nextInt();
        System.out.println("the sum of number till " + n + " is " + sumOfN(n));
        scn.close();
    }
}
