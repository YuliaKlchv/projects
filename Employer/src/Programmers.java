public class Programmers extends Employers {
    private String languages;

    public Programmers(String name, String lastName, int id, String languages) {
        super(name, lastName, id);
        this.languages = languages;
    }

    public void Formate(String op_sys) {
        System.out.println(getName() + " " + "loading the " + op_sys);

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("The languages programmers can speak :" + languages);
    }
}
