public class ClassFormatError {
    public static void main(String[] args){
        try{
            Class.forName("corruptclass");
        }
        catch(Throwable e){
            System.out.println("ClassFormatError caught!");
            System.out.println("message:"+e.getMessage());
        }
    }

}
