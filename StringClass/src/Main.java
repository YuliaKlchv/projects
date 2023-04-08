public class Main {
    public static void main(String[] args) {
       String a = "Yuliya";

       String b = new String("Yuliya");

        System.out.println(b);
        System.out.println("Letters counted: " + b.length());
        System.out.println("0.index: "+ b.charAt(0));
        System.out.println("Last index: "+ b.charAt(b.length()-1));
        System.out.println("to lowercase:"+ b.toLowerCase());

       // for (int i = 0; i<b.length(); i++){
       //     System.out.println(b.charAt(i));
       // }
        String c = "123654789";
        int d = Integer.parseInt(c);
        System.out.println(d-123654787);
    }
}