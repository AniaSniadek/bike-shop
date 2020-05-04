public class Adult extends Bike {

    public Adult(String number, double price, Producer producer, String model, Type type, Material material) {
        super(number, price, producer, model, type, material);
    }

    @Override
    public StringBuilder getDetailsAsString() {
        return super.getDetailsAsString();
    }
}
