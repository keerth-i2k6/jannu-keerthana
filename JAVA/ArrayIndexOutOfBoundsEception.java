public class ArrayIndexOutOfBoundsEception {
    public static void main(String[] args){
        int[] numbers ={1,2,3,4,5};
        try{
            System.out.println(numbers[10]);   
        }
        catch(Exception e){
            System.out.println("caught the array index out of bounds exception"+e.getMessage());
        }
    }
}
    

