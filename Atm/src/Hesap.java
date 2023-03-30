public class Hesap{

    private String username;
    private String parola;
    private int bakiye;

    public Hesap(String username, String parola, int bakiye) {
        this.username = username;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(int tutar) {
        bakiye+=tutar;
        System.out.println("Successfully updates . "+ bakiye);
    }
    public void paraCek(int  tutar) {
        if(bakiye-tutar<0){
            System.out.println("Not enough balance!");
        }
        else {
            bakiye-=tutar;
            System.out.println("New balance : "+bakiye);
        }

    }
}
