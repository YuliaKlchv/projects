public class Main {
    public static void main(String[] args) {
        String[] array = {"Elma","Armut","Kiraz"};
        int[] array2 = {1,2,3,4,5};
        Trial[] array3={new Trial("Hulya "),new Trial("Kurt\n")};

        for(Trial d: array3) {
            d.prnt();
        }
        for(int i: array2){
            System.out.println(i);
        }
        for (String a: array) {
            System.out.println(a);

        }

    }
}