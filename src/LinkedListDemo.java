import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits=new LinkedList<>(List.of("apple","banana","orange","water millon"));
        Iterator<String> it=fruits.iterator();

        while(it.hasNext()){
            System.out.println(it.next());

            fruits.remove(1);
        }
    }
}
