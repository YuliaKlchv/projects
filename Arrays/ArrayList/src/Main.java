import java.util.ArrayList;

public class Main {
    public static void prnt(ArrayList<String> a){

        for(int i=0; i<a.size(); i++) {
            System.out.println("Element"+ (i+1)+":"+a.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Metallica");

        arrayList.add("The Clash");
        arrayList.add("Black Eyes Peas");
        arrayList.add("Enigma");
        arrayList.add("Metallica");

        arrayList.add("The Crown");
        //to remove an element from the list

        arrayList.remove("The Clash");
        arrayList.remove(1);
        // to learn which index is the element located
        System.out.println(arrayList.indexOf("Metallica"));
        //last index
        System.out.println(arrayList.lastIndexOf("Metallica"));
        //to add
        System.out.println(arrayList.add("Tarkan"));
        //update the list
        arrayList.set(4,"Megadeth");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.get(1));

        //sending the arraylist to a function we use the method prnt
        prnt(arrayList);
    }
}