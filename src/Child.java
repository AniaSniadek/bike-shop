public class Child extends Bike{
    public int numberOfWheels;

    public Child(String number, double price, Producer producer, String model, Type type, Material material, int numberOfWheels) {
        super(number, price, producer, model, type, material);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public String getDetailsAsString() {
        String text = "Producer: " + this.getProducerName() +
                " | price: " + this.getPrice() + " | model: " +
                this.getModelName() + " | type: " + this.getTypeName() +
                " | material: " + this.getMaterialName() +
                " | number of wheels: " + this.getNumberOfWheels();
        return text;
    }
}
