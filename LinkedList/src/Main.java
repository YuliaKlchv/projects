import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void print_list(LinkedList<String> destination) {
       // for (String s:destination) {
        //    System.out.println(s);
        //}
        ListIterator<String> iterator = destination.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
      /**  ArrayList<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        languages.add("Kotlin");
        languages.add("Php");


        languages.add(1, "Julia");

        for (String s : languages) {
            System.out.println(s);
        }**/
        LinkedList<String> destination= new LinkedList<String>();
        destination.add("Home");
        destination.add("Supermarkt");
        destination.add("Gym");
        destination.add("Concert");
        destination.add("University");
        destination.add("Post");
        print_list(destination);
        destination.add(4,"Shopping Mall");
        print_list(destination);
        //destination.remove(3);
    }

}