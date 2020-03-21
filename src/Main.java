public class Main {
    public static void main(String[] args){

        //preparing the store environment
        Producer prod1 = new Producer("Kross");
        Producer prod2 = new Producer("Author");

        Type type1 = new Type("trekking");
        Type type2 = new Type("bicyclist");
        Type type3 = new Type("mountain");

        Material mat1 = new Material("aluminium");
        Material mat2 = new Material("steel");
        Material mat3 = new Material("carbon");

        //creating products
        //AdultDetails det1 = new AdultDetails(prod1, "Navigto", type1, mat1);
        Adult bike1 = new Adult("M945", 980.00, prod1, "Navigto", type1, mat1);

        //ChildDetails childDet1 = new ChildDetails(prod1, "Kido", type1, mat1, 2);
        //Child childBike1 = new Child("P456", 459.00, childDet1);

        //adding products to the Magazine
        Magazine magazine = new Magazine();
        magazine.addBike(bike1);
        //magazine.addBike(childBike1);

        System.out.println(bike1.getDetailsAsString());
        magazine.printBikes();
    }
}
