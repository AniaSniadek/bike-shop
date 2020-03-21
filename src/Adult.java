public class Adult extends Bike{
    public AdultDetails adultDetails;

    public Adult(String number, double price, BikeDetails details, AdultDetails adultDetails) {
        super(number, price, details);
        this.adultDetails = adultDetails;
    }

    @Override
    public void getDetailsAsString() {
        super.getDetailsAsString();
    }
}
