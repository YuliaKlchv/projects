public class Kasa {
    private String model;
    private String manufactor;
    private String material;

    public Kasa(String model, String manufactor, String material) {
        this.model = model;
        this.manufactor = manufactor;
        this.material = material;
    }
    public void turnOnPc(){
        System.out.println("Pc is turned on");
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
