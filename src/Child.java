public class Child extends Bike{
    public ChildDetails childDetails;

    public Child(String number, double price, ChildDetails details) {
        super(number, price);
        this.childDetails = details;
    }

    @Override
    public void getDetailsAsString() {
        System.out.println("Producer: " + this.details.getProducerName() +
                " | price: " + this.getPrice() + " | model: " +
                details.getModelName() + " | type: " + this.details.getTypeName() +
                " | material: " + this.details.getMaterialName() +
                " | number of wheels: " + this.childDetails.getNumberOfWheels());
    }
}
