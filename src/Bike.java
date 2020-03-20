public class Bike {
    protected String number;
    protected double price;
    protected BikeDetails details;

    public Bike(String number, double price, BikeDetails details) {
        this.number = number;
        this.price = price;
        this.details = details;
    }

    public String getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BikeDetails getDetails() {
        return this.details;
    }

    public void getDetailsAsString(){
        System.out.println("Producer: " + this.details.getProducerName() +
                " | price: " + this.getPrice() + " | model: " +
                details.getModelName() + " | type: " + this.details.getTypeName() +
                " | material: " + this.details.getMaterialName());
    }
}
