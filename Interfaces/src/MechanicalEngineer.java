public class MechanicalEngineer implements IEnginner {
    private boolean military;
    private boolean criminalRecord;

    public MechanicalEngineer(boolean military, boolean criminalRecord) {
        this.military = military;
        this.criminalRecord = criminalRecord;
    }

    @Override
    public void military_status() {
        if (military) {
            System.out.println("I did my military service");
        } else {
            System.out.println("No, i haven't done it yet !");
        }
    }


    @Override
    public String graduation_status(double grad) {
        return "My avg: " + grad;
    }

    @Override
    public void criminal_record() {
        if (criminalRecord) {
            System.out.println("Yes there is a criminal record");
        } else {
            System.out.println("No , i have none");
        }
    }

    @Override
    public void experience(String[] array) {
        if (array.length == 0) {
            System.out.println("I have no work experience");
        } else
            System.out.println("I worked as a mechanical engineer in such companies : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public void references(String[] array) {
        if (array.length == 0) {
            System.out.println("I have no references");
        }else {
            System.out.println("My reference(s): ");
            for(int i=0;i< array.length;i++) {
                System.out.println(array[i]);
            }
        }
    }
}