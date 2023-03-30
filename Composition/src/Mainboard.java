public class Mainboard {
    private String model;
    private String manufacturer;
    private int numberOfSlots;
    private String operationSystem;
    public Mainboard(String model, String manufacturer, int numberOfSlots, String operationSystem) {
        this.model= model;
        this.manufacturer=manufacturer;
        this.numberOfSlots=numberOfSlots;
        this.operationSystem=operationSystem;
    }
    public void load_op_system(String operationSystem){
        this.operationSystem= operationSystem;
        System.out.println("Operation System is loaded");
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
}
