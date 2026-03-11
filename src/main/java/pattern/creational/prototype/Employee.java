package pattern.creational.prototype;

public class Employee implements  Prototype{

    private String UNumber;
    private double salery;
    public String name;
    private Address address;

    public  Employee(){}

    public Employee(String UNumber, double salery, String name,Address address){
        this.UNumber=UNumber;
        this.salery=salery;
        this.name=name;
        this.address=address;
    }

    @Override
    public Employee clone() {
        // shallow copy
        return new Employee(UNumber,salery,name,address);
    }

    @Override
    public Employee deepClone() {
        return new Employee(UNumber,salery,name,new Address(address.getCity(),address.getStreet(),address.getPincode()));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "UNumber='" + UNumber + '\'' +
                ", salery=" + salery +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
