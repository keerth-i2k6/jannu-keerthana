import java.util.Scanner;
import java.util.Random;

public class votingsimulator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        Random rc=new Random();
        int keerthi=rc.nextInt(1000);
        int preethi=rc.nextInt(1000);
        int deepthi=rc.nextInt(1000);
        int krithi=rc.nextInt(1000);
        System.out.println("enter your age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you are eligible to vote");
            System.out.println("candidates list:");
            System.out.println("1.keerthi");
            System.out.println("2.preethi");
            System.out.println("3.deepthi");
            System.out.println("4.krithi");
            System.out.println("enter your choice:");
            int vote=sc.nextInt();
            if(vote==1){
                keerthi++;
                System.out.println("you voted for keerthi");
            }
            else if(vote==2){
                preethi++;
                System.out.println("you voted for preethi");
            }
            else if(vote==3){
                deepthi++;
                System.out.println("you voted for deepthi");
            }
            else if(vote==4){
                krithi++;
                System.out.println("you voted for krithi");
            }
            else{
                System.out.println("invalid choice");
            }
        }
        else{
            System.out.println("yor are not eligible to vote");
        }
        System.out.println("voting results:");
        System.out.println("total votes for keerthi:"+keerthi);
        System.out.println("total votes for preethi:"+preethi);
        System.out.println("total votes for deepthi:"+deepthi);
        System.out.println("total votes for krithi:"+krithi);
        if(keerthi>preethi && keerthi>deepthi && keerthi>krithi){
            System.out.println("keerthi is the winner");
        }
        else if(preethi>keerthi && preethi>deepthi && preethi>krithi){
            System.out.println("preethi is the winner");
        }
        else if(deepthi>keerthi && deepthi>preethi && deepthi>krithi){
            System.out.println("deepthi is the winner");
        }
        else if(krithi>keerthi && krithi>preethi && krithi>deepthi){
            System.out.println("krithi is the winner");
        }
        else{
            System.out.println("it's a tie");
        }
    }
}