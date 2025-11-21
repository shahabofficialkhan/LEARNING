import java.util.ArrayList;
// class father {
//     void message(){
//         System.out.println("The father message");
//     }
// }

// class mother extends father {
//     void accessing (){
//         super.message();
//     }
//     void message(){
//         System.out.println("The Mother message");
//     }
 
// }
public class Parent {
    public static void main(String[] args) {
        System.out.println("Welcome");
        // mother x = new mother();
        // x.message();
        // x.accessing();

        //Arraylist I am going to practice here \
        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("Apple ");
        fruits.add("Mango");
        fruits.add("jsa");
        System.out.println(fruits);
        System.out.println(fruits.get(0));


    
    }
    
}
// Ek Parent class banao jisme ek method message() ho → "This is parent message".
// Ek Child class banao jisme bhi same method ho jo "This is child message" print kare.
// Ab Child ke object se dono messages print karna hai (ek normal, ek super ke through).