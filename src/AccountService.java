import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountService {
    public static void main(String[] args) {
        List<Account> accounts=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of accounts you want to create");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter Account number");
            long accNum=sc.nextLong();
            System.out.println("Enter Name");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter pin");
            int pin=sc.nextInt();
            System.out.println("Enter initial amount");
            double bal=sc.nextDouble();
            accounts.add(new Account(accNum,name,pin,bal));
        }
        for(Account acc:accounts){
            System.out.println(acc);
        }
        //retrive particular record
        System.out.println("Enter acc number to get account details");
        long accNum=sc.nextLong();
        for(Account acc:accounts){
            if(acc.getAccId()==accNum){
                System.out.println(acc);
            }
        }
        System.out.println("Enter Account Id to Delete the account");
        long accId=sc.nextLong();
        for(Account acc:accounts){
            if(acc.getAccId()==accNum){
                System.out.println(accounts.remove(acc));
            }
        }

        System.out.println("Enter Account number to update");
        long acId=sc.nextLong();
        System.out.println("Enter Updated Pin ");
        int pin=sc.nextInt();
        for(Account acc:accounts){
            if(acc.getAccId()==accNum){
                acc.setPin(pin);
            }
        }

    }
}
