package pattern.creational.builder;

public class Computer {
    private final String cName;
    private final int price;
    private final String serialNumber;

    private Computer(Builder builder){
        cName=builder.cName;
        price=builder.price;
        serialNumber=builder.serialNumber;
    }

    @Override
    public String toString(){
        return this.cName +" " + this.serialNumber;
    }

    public static class Builder{
        private String cName;
        private int price;
        private String serialNumber;

        public Builder(){}

        public Builder setcName(String cName){
            this.cName=cName;
            return this;
        }

        public Builder setPrice(int price){
            this.price=price;
            return this;
        }
        public Builder setSerialNumber(String serialNumber){
            this.serialNumber=serialNumber;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }


    }

}
