import java.util.Scanner;
public class factorial {
    public static int calculate(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else if(n<0){
            System.out.println("give valid input");
            return 0;
        }
        else {
            return n * calculate(n-1);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("give integer n:");
        int n = scn.nextInt();
        System.err.println("the factorial of the number " + n + " is: " + calculate(n));
    }
}
