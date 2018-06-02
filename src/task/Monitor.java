package task;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;


    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public Monitor(String manufacturer, double price, String serialNumber, int resolutionX, int resolutionY) {

        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: " +
                "manufacturer=" + getManufacturer() +
                ", price=" + getPrice() +
                ", serialNumber=" + getSerialNumber()+
                ", X="+resolutionX+
                ", Y="+resolutionY;
    }
}
