public class ifelse {
    public static void main(String[] args) {
        int eng = 92;
        int science = 80;
        int mat = 75;
        int social = 83;
        int java = 77;
        int total = eng + science + mat + social + java;
        int grade = total/5;
        if (grade >=95){
            System.out.println("O");
        }
            else if(grade >=85){
                System.out.println("A");
            }
                else if (grade >=75){
                    System.out.println("B");
                }
                    else if (grade >=65){
                        System.out.println("C");
                    }
                        else if (grade >=55){
                            System.out.println("D");
                        }
                            else {
                                System.out.println("F");
                            }   
    }
}
