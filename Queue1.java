
package queue1;
import java.util.LinkedList;
import java.util.Queue;


public class Queue1 {

    public static void main(String[] args) {
      
       
        Queue<String> queue = new LinkedList<>();

        
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

       
        String firstElement = queue.poll(); 
        String secondElement = queue.poll(); 
        
        
        System.out.println("Remaining elements in the queue: " + queue);

        
        queue.add("Date");
        queue.add("Eggplant");

       
        String thirdElement = queue.poll(); 

        
        System.out.println("Remaining elements in the queue: " + queue);
    }
}
    

