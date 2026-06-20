package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_BANK {
    static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 10029);
        long balance = amit.getBalance();
        System.out.println(amit.getBalance());
    }
}

class ICICIBank{
    private String name;
    private long balance;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance, boolean isCashier) {
        if(isCashier){
            this.balance = balance;
        }
        else {
            System.out.println("Not allowed to modify the balance");
        }
        this.balance = balance;
    }

    public ICICIBank(String name, long balance){
        this.name = name;
        this.balance = balance;
    }


}