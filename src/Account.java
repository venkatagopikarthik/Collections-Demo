public class Account {
    private long accId;
    private String name;
    private int pin;
    private double balance;

    public Account(long accId, String name, int pin, double balance) {
        this.accId = accId;
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public long getAccId() {
        return accId;
    }

    public void setAccId(long accId) {
        this.accId = accId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accId=" + accId +
                ", name='" + name + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }

}
