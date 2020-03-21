public class ChildDetails extends BikeDetails{
    public int numberOfWheels;

    public ChildDetails(Producer producer, Model model, Type type, Material material, int numberOfWheels) {
        super(producer, model, type, material);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
