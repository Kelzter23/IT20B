
package linkedlist2;

 import java.util.LinkedList;
public class Linkedlist2 {

   

    public static void main(String[] args) {
        LinkedList<String> surname = new LinkedList<>();


        surname.add("ongcol");
        surname.addFirst("sales");
      surname.addLast("panis");
       surname.add(1, "hinoyog");

        System.out.println("Linked List Original: " + surname);
        System.out.println(surname.size());

  
        if (surname.contains("hinoyog")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean containslion = surname.contains("hinoyog");
        System.out.println(containslion);


    }
    
}
