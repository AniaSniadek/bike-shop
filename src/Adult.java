public class Adult extends Bike {

    public Adult(String number, double price, Producer producer, String model, Type type, Material material) {
        super(number, price, producer, model, type, material);
    }

    @Override
    public String getDetailsAsString() {
        return super.getDetailsAsString();
    }
}
