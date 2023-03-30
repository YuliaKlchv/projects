public class Computer {
    private Monitor monitor;

    private Kasa kasa;
    private Mainboard mainboard;

    public Computer(Monitor monitor, Kasa kasa, Mainboard mainboard) {
        this.monitor = monitor;
        this.kasa = kasa;
        this.mainboard = mainboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }
}
