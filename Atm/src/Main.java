public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Hesap hesap= new Hesap("Yuliya K","123456",3000);
        atm.calis(hesap);
        System.out.println("Quiting");
    }
}