import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> names=new HashSet<>();
        names.add("gopi");
        names.add("karthik");
        names.add("venkata");
        names.add("praneeth");
        names.add(null);
        Iterator<String> it=names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //delete
        names.remove("gopi");
        names.remove(0);


    }
}
