package task;

public class Device {
    private String manufacturer;
    private double price;
    private String serialNumber;

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Device(String manufacturer, double price, String serialNumber) {

        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }
}
