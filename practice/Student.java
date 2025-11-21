

public class Student {
    String name ;
    int rollNo ;
    int marks ;
    static int totalmarks = 1100;
    Student (){}
   Student (String name , int rollNo , int marks){

   System.out.println("COnstructor Called ");
    this.name = name ;
    this.rollNo = rollNo;
    this.marks = marks;
   }

    void displayallmydetail (){
        name = "ahmad";
        System.out.println("Student Info");
        System.out.println("NAME\t"+name);
        System.out.println("rollno\t"+rollNo);
        System.out.println("marks\t"+marks);
    }
    int average (){
        return (marks*100)/totalmarks;
    }
    void Result (){
        int averagenumber = average();
        if (averagenumber <=100){
            if (averagenumber >=50)
           { System.out.println("pass ");}
            else {
                System.out.println("fail");
            }
        }

    }
    public static void main(String[] args) {
        //
        // System.out.println("Welcpme to our Progame");
        // //Object creation
        // Student shahab = new Student();

        // shahab.name="Shahab";
        // shahab.marks = 1008;
        // shahab.rollNo = 102;
        // System.out.println(shahab.average());

        // shahab.Result();

        // Student x = new Student("Fahad", 102, 1032);
        // x.displayallmydetail();
        // x.average();
        // x.Result();

        CUIstd v = new CUIstd();
        v.setter(102, "EDcr$41199");
        v.getter();
    }
    
}
//Java Class Attributes
// 👉 Scenario: Ek Student class banao jisme 
// attributes: name, rollNo, marks.
// Ek function banao jo student ka percentage calculate kare.
// Ek function banao jo batae ke student pass hai ya fail.