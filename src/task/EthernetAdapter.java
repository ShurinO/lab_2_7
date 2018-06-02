package task;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public EthernetAdapter(String manufacturer, double price, String serialNumber, int speed, String mac) {

        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }
}