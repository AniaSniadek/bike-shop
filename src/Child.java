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
        String text = ANSI_CYAN+ "Producer: " + ANSI_RESET + this.getProducerName() +
                ANSI_CYAN + " | Price: " + ANSI_RESET + this.getPrice() + ANSI_CYAN + " | Model: " + ANSI_RESET +
                this.getModelName() + ANSI_CYAN + " | Type: " + ANSI_RESET + this.getTypeName() +
                ANSI_CYAN + " | Material: " + ANSI_RESET + this.getMaterialName() +
                ANSI_CYAN + " | number of wheels: " + ANSI_RESET + this.getNumberOfWheels();
        return text;
    }
}
