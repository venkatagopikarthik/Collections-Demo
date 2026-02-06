import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        set.add("gopi");
        set.add("karthik");
        set.add("venkat");
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
