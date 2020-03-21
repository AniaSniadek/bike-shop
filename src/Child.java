public class Child extends Bike{
    public ChildDetails childDetails;

    public Child(String number, double price, ChildDetails details) {
        super(number, price);
        this.childDetails = details;
    }

    @Override
    public String getDetailsAsString() {
        String text = "Producer: " + this.details.getProducerName() +
                " | price: " + this.getPrice() + " | model: " +
                details.getModelName() + " | type: " + this.details.getTypeName() +
                " | material: " + this.details.getMaterialName() +
                " | number of wheels: " + this.childDetails.getNumberOfWheels();
        return text;
    }
}
