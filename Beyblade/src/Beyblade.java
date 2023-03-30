public class Beyblade {
    private String name;
    private int spin;
    private int attack;

    public Beyblade(String name, int spin, int attack) {
        this.name = name;
        this.spin = spin;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpin() {
        return spin;
    }

    public void setSpin(int spin) {
        this.spin = spin;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void powAttack(){
        System.out.println(getName()+" "+ attack+" with "+ spin );
    }
    public void monsterAttack() {
        System.out.println("This beyblade has no monstar");
    }
    public void showInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Attack: "+ attack);
        System.out.println("spin: "+ spin);

    }
}
