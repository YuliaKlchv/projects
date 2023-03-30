public class Dragon extends Beyblade {
    private String holyBeast;
    private String secretTalent;

    public Dragon(String name, int spin, int attack, String holyBeast, String secretTalent) {
        super(name, spin, attack);
        this.holyBeast = holyBeast;
        this.secretTalent = secretTalent;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("The name of holy beast: " + holyBeast);
        System.out.println("Secret Talent : " +secretTalent);
    }

    @Override
    public void monsterAttack() {

        System.out.println(getName() + " attacking with " + holyBeast);
        System.out.println(getName()+ " has a ghost storm");
    }


}