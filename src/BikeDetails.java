public class BikeDetails {
    protected Producer producer;
    protected Model model;
    protected Type type;
    protected Material material;


    public BikeDetails(Producer producer, Model model, Type type, Material material) {
        this.producer = producer;
        this.model = model;
        this.type = type;
        this.material = material;
    }

    public String getProducerName(){
        return this.producer.getProducer();
    }

    public String getModelName(){
        return this.model.getModel();
    }

    public String getTypeName(){
        return this.type.getType();
    }

    public String getMaterialName(){
        return this.material.getMaterial();
    }
}
