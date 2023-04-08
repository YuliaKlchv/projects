import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static  void print_ops(){
        System.out.println("0-View the Operations");
        System.out.println("1-Next City");
        System.out.println("2-Previous City");
        System.out.println("3-Quit");
    }
    public static void city_trip(LinkedList<String> cities) {
        ListIterator<String>iterator= cities.listIterator();

        int ops;
        print_ops();
        Scanner scanner = new Scanner(System.in);

        if(!iterator.hasNext()){
            System.out.println("There is no city");
        }
        boolean exit =false;

        while(!exit) {
            System.out.println("choose an op");
            ops= scanner.nextInt();
            switch(ops) {
                case 0:
                    print_ops();
                    break;
                case 1:
                    if(iterator.hasNext()){
                        System.out.println("Going to " +iterator.next());
                    }else{
                        System.out.println("There is no more city left to go");
                        }
                    break;
                case 2:
                    if(iterator.hasPrevious()) {
                        System.out.println("Going to "+ iterator.previous());
                    }else {
                        System.out.println("City trip is started");
                    }
                    break;
                case 3:
                    exit =true;
                    System.out.println("Quiting");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<String> cities= new LinkedList<String>();
            cities.add("Ankara");
            cities.add("Istanbul");
            cities.add("New York");
            cities.add("London");
            cities.add("Barcelona");
            cities.add("Vienna");
            city_trip(cities);
    }
}