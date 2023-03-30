public class FabrikBeyblade {
    public Beyblade beybladeManufactor(String type) {
        if (type.equals("Dragon")) {
            return new Dragon("Takao", 800, 300, "Blue Dragon", "Talking with the Holy beast");
        } else if (type.equals("Dranza")) {
            return new Dranza("Kai", 600, 400, "Red Phoenix");
        } else if (type.equals("Dranya")) {
            return new Dranza("Rei", 800, 250, "White Tiger");
        } else if (type.equals("Draciel")) {
            return new Dranza("Rei", 800, 250, "White Tiger");
        } else {
            return null;
        }
    }
}
