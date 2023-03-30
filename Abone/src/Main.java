public class Main {
    public static void main(String[] args) {

        /* Abone abone = new Abone();
        abone.name ="Yuliya K";
        abone.balance= 100;
        abone.city="Vienna";

       abone.energyConsumption(200);*/

        EncapsulateAbone abone = new EncapsulateAbone("Yuliya K",80,"Vienna");
        abone.checkBalance();
    }
}