public class Main {
    public static void main(String[] args) {
    CScientist engineer1 = new CScientist(false,false);

    engineer1.military_status();
    engineer1.criminal_record();
        System.out.println(engineer1.graduation_status(3.5));
        String[] experience1= {"Vestel","Havelsan","Turksat"};

        engineer1.experience(experience1);

        MechanicalEngineer engineer2 = new MechanicalEngineer(false,true);

        String[] experience2 = {};
        String [] referance = {"Hulya Kurt","Eray Ozturk"};
        engineer2.criminal_record();
        engineer2.military_status();
        System.out.println("Graduatetion average"+ engineer2.graduation_status(2.2));
        engineer2.experience(experience2);
        engineer2.references(referance);


        }
}