public class Employers {
    private  String name;
    private  String lastName;
    private  int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employers(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }
    public void showInfo() {
        System.out.println("Employer Information: ");
        System.out.println("Firstname: " +name);
        System.out.println("Lastname: " +lastName);
        System.out.println("ID: " +id);

    }
}
