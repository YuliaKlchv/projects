import java.util.Scanner;

public class Test {
    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);
    public static  void print_singers() {
        System.out.println("\t 0-view the Operations");
        System.out.println("\t 1-view the Singers");
        System.out.println("\t 2-add a Singer");
        System.out.println("\t 3-update the Singers");
        System.out.println("\t 4-delete the Singers");
        System.out.println("\t 5-search the Singers");
        System.out.println("\t 6-Exit");

    }
    public static void view() {
        singers.print_singers();

    }
    public static void add_singers(){
        System.out.println("Add the singer in the list");
        String name= scanner.nextLine();
        singers.add_singers(name);
    }
    public static void update_singers() {
        System.out.println("Please type the update-position: ");
        int position= scanner.nextInt();
        scanner.nextLine();
        String new_name = scanner.nextLine();
        singers.update_singers(new_name,position-1);
    }
    public static void delete_singers() {
        System.out.println("Which singer would you like to delete");
        int position= scanner.nextInt();
        singers.delete_singers(position-1);
    }
    public static  void seek_singers() {
        System.out.println("Which singer would u search: ");
        String name = scanner.nextLine();
        singers.seek_singers(name);
    }
    public static void main(String[] args) {
        System.out.println("\tWelcome to Singer-App");

        print_singers();
        boolean exit= false;
        int ops;
        while(!exit) {
            System.out.println("Choose an operation");
            ops = scanner.nextInt();
            scanner.nextLine();

            switch (ops){
                case 0:
                    print_singers();
                    break;
                case 1:
                    view();
                    break;
                case 2:
                    add_singers();
                    break;
                case 3:
                    update_singers();
                    break;

                case 4:
                    delete_singers();
                    break;

                case 5:
                    seek_singers();
                    break;
                case 6:
                    exit=true;
                    System.out.println("Quiting...");
                    break;
            }
        }
    }
}
