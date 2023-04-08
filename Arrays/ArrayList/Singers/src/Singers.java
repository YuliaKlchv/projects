import java.util.ArrayList;

public class Singers {
    private ArrayList<String> list_of_singers = new ArrayList<String>();

    public void print_singers() {
        System.out.println("In the list there are "+ list_of_singers.size()+" singers");
        for(int i=0; i<list_of_singers.size(); i++) {
            System.out.println((i+1)+".Singer :" + list_of_singers.get(i));
        }
    }
    public void add_singers(String name) {
        list_of_singers.add(name);
        System.out.println("The list is updated !");
    }
    public void update_singers(String new_name,int position){
        list_of_singers.set(position,new_name);
        System.out.println("The list is updated");
    }
    public void delete_singers(int position) {
        String name = list_of_singers.get(position);
        list_of_singers.remove(position);
        System.out.println(name+ " is deleted.The list is updated");
    }
    public void seek_singers(String singers_name) {
        int position = list_of_singers.indexOf(singers_name);
        if(position>=0) {
            System.out.println("The singer is found");
            System.out.println(singers_name+"is at"+(position+1)+" .position");
        }else {
            System.out.println("No data found!");
        }
    }
}