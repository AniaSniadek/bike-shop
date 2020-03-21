public class Bike {
    protected String number;
    protected double price;
    protected Producer producer;
    protected String model;
    protected Type type;
    protected Material material;

    public Bike(String number, double price, Producer producer, String model, Type type, Material material) {
        this.number = number;
        this.price = price;
        this.producer = producer;
        this.model = model;
        this.type = type;
        this.material = material;
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


    public String getProducerName(){
        return this.producer.getProducer();
    }

    public String getModelName(){
        return this.model;
    }

    public String getTypeName(){
        return this.type.getType();
    }

    public String getMaterialName(){
        return this.material.getMaterial();
    }

    public String getDetailsAsString(){
        String text = "Producer: " + this.getProducerName() +
                " | price: " + this.getPrice() + " | model: " +
                this.getModelName() + " | type: " + this.getTypeName() +
                " | material: " + this.getMaterialName();
        return text;
    }
}
