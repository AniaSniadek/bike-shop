public class Bike {
    protected final String number;
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
        String text = Colors.ANSI_GREEN + "Producer: " + Colors.ANSI_RESET + this.getProducerName() +
                Colors.ANSI_GREEN + " | Price: " + Colors.ANSI_RESET + this.getPrice() + Colors.ANSI_GREEN + " | Model: " + Colors.ANSI_RESET +
                this.getModelName() + Colors.ANSI_GREEN + " | Type: " + Colors.ANSI_RESET + this.getTypeName() +
                Colors.ANSI_GREEN + " | Material: " + Colors.ANSI_RESET + this.getMaterialName();
        return text;
    }
}
