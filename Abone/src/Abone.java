public class Abone {
      public String name;
      public int balance;
      public String city;

      public void energyConsumption(int amount) {
          if((this.balance-amount)<0) {
              System.out.println("You do not have enough balance !");
          }else {
              this.balance-=amount;
              if(this.balance<=0) {
                  System.out.println("Balance is over. Please reload your balance again !");
              }else {
                  System.out.println("New balance :" + balance);
          }
          }
          }
          public void checkBalance() {
              System.out.println("Balance: "+ balance);
      }

}

