public class Drayga extends Beyblade {
    private String holyBeast;

    public Drayga(String name, int spin, int attack, String holyBeast) {
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

        System.out.println(getName() + " attacking with " + holyBeast);
        System.out.println(getName()+ " has a water storm");
    }


}