public class BasicTryCatch {
    public static void main(String[] args){
       int a=10;
       int b=0;
       try{
        int result = a / b;
        System.out.println("result:"+result);
}  
catch (Exception keerthana){
    System.out.println("caught the exception" + keerthana.getMessage());
}

}
}
