import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> sports=new ArrayList<>(List.of("cricket","hockey"));
        for(String s:sports){
            System.out.println(s);

        }
        //insert at index
        sports.add(1,"football");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of elements to add");
        int size=sc.nextInt();
        System.out.println("Enter elements to add to list");
        sc.nextLine();
        for(int i=0;i<size;i++){

            sports.add(sc.nextLine());
        }
        System.out.println("ENter number of elements you want to remove");
        int s=sc.nextInt();
        System.out.println("Enter elements to remove");
        sc.nextLine();
        for(int i=0;i<s;i++){

            String ele=sc.nextLine();
            int index=sports.indexOf(ele);
            if(index!=-1)
            sports.remove(index);
            else System.out.println("no such element");
        }
        System.out.println(sports);


    }
}
