public class Adult extends Bike{
    public AdultDetails adultDetails;

    public Adult(String number, double price, AdultDetails adultDetails) {
        super(number, price);
        this.adultDetails = adultDetails;
    }

    @Override
    public String getDetailsAsString() {
        return super.getDetailsAsString();
    }
}
