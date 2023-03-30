import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our Bank");
        System.out.println("*****************************************");

        int giris_hakki =3;

        while(true) {
            if(login.login(hesap)){
                System.out.println("Login successfull");
                break;
            }else{
                System.out.println("Login unsuccessfull");
                giris_hakki-=1;
                System.out.println("try : "+ giris_hakki);

            }
            if(giris_hakki==0){
                System.out.println("You tried enough. Its all unsuccessfull ! Come back later ");
                return;
            }
        }
                String islemler= "1.Learn Credit\n"+
                        "2.Cash out\n"+
                        "3.Add money\n"+
                        "4.quit";
        System.out.println("*****************************************");
        System.out.println(islemler);


        while(true){
            System.out.println("Please choose the operation");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                break;
            }else if(islem.equals("1")){
                System.out.println("Available Credit: "+ hesap.getBakiye());

            }else if(islem.equals("2")) {
                System.out.println("How much would you like to cash out: ");
                int tutar= scanner.nextInt();
                hesap.paraCek(tutar);

            }else if(islem.equals("3")){
                System.out.println("How much would you like to deposite: ");
                int tutar =scanner.nextInt();
                hesap.paraYatir(tutar);

            }else {
                System.out.println("Invalid");
                break;
            }
        }
    }
}
