public class EncapsulateAbone {
    private String name;
    private int balance = 120;
    private String city;

    public EncapsulateAbone(String name, int balance, String city) {
        this.name = name;
        if (balance >= 0 && balance <= 120) {
            this.balance = balance;
        }
        this.city = city;
    }

    public void energyConsumption(int amount) {
        if ((this.balance - amount) < 0) {
            System.out.println("You do not have enough balance !");
        } else {
            this.balance -= amount;
            if (this.balance <= 0) {
                System.out.println("Balance is over. Please reload your balance again !");
            } else {
                System.out.println("New balance :" + balance);
            }
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
