import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Employee System");
        String operation = "1.Choose as Programmer\n" +
                "2.Choose as Manager\n" +
                "3.Press 'q' for quiting ";
        System.out.println("*********************************");
        System.out.println(operation);
        System.out.println("***********************************");

        while (true) {
            System.out.println("Please choose: ");
            String operations = scanner.nextLine();

            if (operations.equals("q")) {
                System.out.println("Quiting");
                break;

            } else if (operations.equals("1")) {
                Programmers programmers = new Programmers("Hulya", "Kurt", 55, "Java");

                while(true) {
                    System.out.println("Please choose an operation from programmer side: ");
                    String operationns= scanner.nextLine();
                    String op_program = "1.Formate\n" +
                            "2. Show Info\n" +
                            "3. Quit";
                    System.out.println(op_program);

                    if (operationns.equals("q")) {
                        System.out.println("Quiting");
                        break;
                    } else if (operationns.equals("1")) {
                        System.out.println("Operation System : ");
                        String op_sys = scanner.nextLine();
                        programmers.Formate(op_sys);

                    } else if (operationns.equals("2")) {
                        programmers.showInfo();
                    } else {
                        System.out.println("Invalid");
                    }
                }
            } else if (operations.equals("2")) {
                Managers managers = new Managers("Serhat", "Say", 45, 10);
                String op_managers = "1.Raise the lohn\n" +
                        "2. Show Info\n" +
                        "3. Quit";
                System.out.println(op_managers);
                while (true) {
                    System.out.println("Choose something from manager side");
                    String op_manager = scanner.nextLine();
                    if (op_manager.equals("q")) {
                        System.out.println("Quiting");
                        break;
                    } else if (op_manager.equals("1")) {
                        System.out.println("How much you raise: ");
                        int amount = scanner.nextInt();
                        scanner.nextLine();

                        managers.raise(amount);

                    } else if (op_manager.equals("2")) {
                        managers.showInfo();
                    } else {
                        System.out.println("Invalid");
                    }
                }
            } else {
                System.out.println("Entered a wrong value");
            }
        }
    }
}

