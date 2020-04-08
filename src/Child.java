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
        String text = Colors.ANSI_CYAN+ "Producer: " + Colors.ANSI_RESET + this.getProducerName() +
                Colors.ANSI_CYAN + " | Price: " + Colors.ANSI_RESET + this.getPrice() + Colors.ANSI_CYAN + " | Model: " + Colors.ANSI_RESET +
                this.getModelName() + Colors.ANSI_CYAN + " | Type: " + Colors.ANSI_RESET + this.getTypeName() +
                Colors.ANSI_CYAN + " | Material: " + Colors.ANSI_RESET + this.getMaterialName() +
                Colors.ANSI_CYAN + " | number of wheels: " + Colors.ANSI_RESET + this.getNumberOfWheels();
        return text;
    }
}
