package pattern.creational.builder;

public class main {
    public static void main(String[] args) {
        System.out.println("Builder pattern..");

        Computer c=new Computer.Builder().setcName("Mac").setPrice(3565).build();
        System.out.println(c);

        c=new Computer.Builder().setcName("Iav").build();
        System.out.println(c);

    }
}
