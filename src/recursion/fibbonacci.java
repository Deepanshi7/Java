import java.util.Scanner;
public class fibbonacci {
    public static int calculate(int n){
        if(n==0)    {return 0;}
        if(n==1)    {return 1;}
        if (n>1){
            return calculate(n-1) + calculate(n-2);
        } 
        return -1;
        }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("give number : ");
        int n = scn.nextInt();
        System.out.println("the answer is : "+ calculate(n));
    }
    }


