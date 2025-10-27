import devices.PersonalComputer;
import devices.Phone;

public class Main {
    public static void main(String[] args) {

        PersonalComputer pc1 = new PersonalComputer(1, 45000);
        PersonalComputer pc2 = new PersonalComputer(2, 120000, "192.168.1.10");
        
        Phone phone1 = new Phone(3, 25000);
        Phone phone2 = new Phone(4, 65000, "192.168.1.20");

        Device[] devices = {pc1, pc2, phone1, phone2};
        
        for (Device device : devices) {
            System.out.println(device.sprint());
            System.out.println("Type: " + device.getDeviceType());
            System.out.println("Id: " + device.getDeviceId());
            System.out.println("Price: " + device.getPrice());
            System.out.println("Ip: " + (device.getIp() != null ? device.getIp() : "0"));
        }
    }
}