import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Welcome to training program");
        String trainings= "Start with:\n"+
                "Burpee\n"+
                "Pushup\n"+
                "SitUp\n"+
                "Squat\n";
        System.out.println(trainings);

        System.out.println("Create a training program");
        System.out.println("Burpee count: ");
        int burpee= scanner.nextInt();
        System.out.println("Pushup count: ");
        int pushup= scanner.nextInt();
        System.out.println("Situp count: ");
        int situp= scanner.nextInt();
        System.out.println("Squat count: ");
        int squat= scanner.nextInt();

        scanner.nextLine();

        Training training = new Training(burpee,pushup,situp,squat);

        System.out.println("Training is starting");

        while(training.isTrainingOver()==false) {
            System.out.println("Sport type (Burpee, PushUp,Situp,Squat):");
            String round = scanner.nextLine();
            System.out.println("How many would you like to do?");
            int count = scanner.nextInt();
            scanner.nextLine();
            training.move(round,count);
        }

    }
}