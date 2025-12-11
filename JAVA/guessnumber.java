import java.util.Random;
import java.util.Scanner;
public class guessnumber {
    public static void main(String[] args){
        Random rc=new Random();
        Scanner sc=new Scanner(System.in);
        int target = rc.nextInt(50);
        int guess=0;
        while(target!=guess){
            System.out.println("guess the number between 0 to 50:");
            guess=sc.nextInt();
        if(guess==target){
            System.out.println("you guessed it right");
        }
        
        else if(guess<target){
            System.out.println("your guess is less than the target");
        }
        else if(guess>target){
            System.out.println("your guess is more than the target");
        }
        else {
            System.out.println("invalid number");
            break;
        }
       
    }
   
}
}
