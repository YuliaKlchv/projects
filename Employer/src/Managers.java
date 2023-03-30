public class Managers extends Employers {
    private int responsible_person_number;

    public Managers(String name, String lastName, int id, int responsible_person_number) {
        super(name, lastName, id);
        this.responsible_person_number= responsible_person_number;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("The person is  responsible for "+ responsible_person_number+ " employers");
    }

    public void raise(int amount) {
        System.out.println(getName()+" gives "+amount+" Euro as raise");
    }
}
