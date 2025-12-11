public class functions {
    public static void main(String[] args){
    System.out.println(add(2,3));
    System.out.println(sub(4,2));
    System.out.println(mul(4,2));
    System.out.println(div(4,2));
    System.out.println(mod(32, 3));
        }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static int mod(int a,int b){
        return a%b; 
    } 
}   