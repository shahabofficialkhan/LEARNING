class Studentinfo {
int roll_no =102;
String name = "Shahab" ;
void full_detail (){
 System.out.println(roll_no);
 System.out.print(name);
 
}
void work (){
    System.out.println("Study ");
}
}

public class Student {

    public static void main (String []args){
        // System.out.println("Shahab");
        Studentinfo shahab = new Studentinfo();
        shahab.name = "Shahab";
        shahab.roll_no= 20;
        // shahab.work();
        shahab.full_detail();

    }
}
