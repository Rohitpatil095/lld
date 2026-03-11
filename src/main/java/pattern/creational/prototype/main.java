package pattern.creational.prototype;

public class main {
    public static void main(String[] args) {

        System.out.println("Prototype demo..");

        Address address=new Address("vasoka","balmon ford",3687);
        Employee e1= new Employee("6057593",546.35,"ramc",address);

        Employee e2=e1.clone();
        Employee e3= e1.deepClone();

        System.out.println("e1 original " + e1);
        System.out.println("e2 shallow clone" + e2);
        System.out.println("e3 deep clone  " + e3);
    }
}
