public class Dranza extends Beyblade {
    private String holyBeast;

    public Dranza(String name, int spin, int attack, String holyBeast) {
        super(name, spin, attack);
        this.holyBeast = holyBeast;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("The name of holy beast: " + holyBeast);
    }

    @Override
    public void monsterAttack() {
        System.out.println(getName()+" has choose the  "+ holyBeast  );
        System.out.println(getName()+" attacking with Burning Sword " );

    }
}
