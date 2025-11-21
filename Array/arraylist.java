import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        System.out.println("Welcome To Shahab's Study Hub");
        // System.out.println("Toady we are gonna Arraylist");
        // ArrayList<String> list = new ArrayList<>();
        
        //  ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add("12");
        // list.add("11");
        // list.add("12");
        // ArrayList<Boolean> trueorfalse = new ArrayList<>();
        
        // Add
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(1 , 19);
        // System.out.println(list);
        //At specific Index
        System.out.println(list.get(1));

        //  set

        list.set(1,200);
        System.out.println(list);

         int size =list.size();
        // System.out.println(size);

        //Delete
        list.remove(3);
        System.out.println(list);
        // list.clear();
        // System.out.println(list);

       
       
    }
}
