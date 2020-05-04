public class Child extends Bike {

    public int numberOfWheels;

    public Child(String number, double price, Producer producer, String model, Type type, Material material, int numberOfWheels) {
        super(number, price, producer, model, type, material);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public StringBuilder getDetailsAsString() {
        return super.getDetailsAsString().append(Colors.ANSI_CYAN + " | number of wheels: " + Colors.ANSI_RESET + this.getNumberOfWheels());
    }
}
