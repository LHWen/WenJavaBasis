
/** 使用 abstract calss 定义抽象类 */
public abstract class AbstractClass {

    private String name;
    private String address;
    private int number;

    public AbstractClass(String name, String address, int number) {
        System.out.println("Constructing an Abstract");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("Inside Abstract computePay");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}
