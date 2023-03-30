public class Test {
    public static void main(String[] args) {
        Resolution resolution= new Resolution(1920,1080);
        Monitor monitor = new Monitor("VS197DE","ASUS","18.5",resolution);
        Kasa kasa = new Kasa("Shadow Blade","Shadow","Glass");
        Mainboard mainboard = new Mainboard("B-250-PRO","ASUS",10,"Windows 10");
        Computer pc = new Computer(monitor,kasa,mainboard);
        pc.getKasa().turnOnPc();
        pc.getMonitor().turnOffMonitor();
        pc.getMainboard().load_op_system("Ubuntu 16.04");
    }
}