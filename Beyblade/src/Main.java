import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Beyblade Program");
        System.out.println("press 'q' for exit");

        Scanner scanner= new Scanner(System.in);

        while(true) {
            System.out.println("Which Bayblade do you want to supply: ");
            String ops= scanner.nextLine();
            if(ops.equals("q")){
                System.out.println("Quiting...");
            }else {
                FabrikBeyblade fabrik = new FabrikBeyblade();
                Beyblade beyblade =fabrik.beybladeManufactor(ops);

                if(beyblade==null) {
                    System.out.println("Please enter a valid name ");
                }else {
                    beyblade.showInfo();
                    beyblade.monsterAttack();
                    beyblade.powAttack();
                }
            }
        }
    }
}