import java.util.Scanner;
public class factorialCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 9;
        System.out.println(factorial(fact));
    }
    public static int factorial(int num)
    {
        //base case
        if(num==0) return 1;
        if(num==1) return 1;

        return num*factorial(num-1);
    }
}
