package lab27;

import task.Device;
import task.EthernetAdapter;
import task.Monitor;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung",560,"AR34556F6GH");
        Device monitor = new Monitor("LG",450,"LG32P45GTR89T",1920,1080);
        Device ethernetAdapter = new EthernetAdapter("Pro-Link",110,"PL3456270SB",100,"aret45:fgrtt:456dg:67hhku");
        Device device2 = new Device("HP",370,"HP250GRT457YT");
        Device monitor2 = new Monitor("NEC",550,"NC22TGH45T67",1400,1050);
        Device ethernetAdapter2 = new EthernetAdapter("D-Link",80,"DL220UHL",100,"kkl45:gtr4h:776s3:0h282");
        Device[] devices = {device,monitor,ethernetAdapter,device2,monitor2,ethernetAdapter2};
        for (Device device1 : devices) {
            System.out.println(device1);
        }

    }
}
