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
        Adult bike1 = new Adult("M945", 980.00, prod1, "Navigto", type1, mat1);
        Adult bike2 = new Adult("G570", 799.00, prod2, "Kim", type1, mat2);
        Adult bike3 = new Adult("P456", 459.00, prod1, "Jasen", type2, mat2);
        Adult bike4 = new Adult("S909", 1000.00, prod2, "Olsen", type3, mat3);
        Adult bike5 = new Adult("F538", 999.00, prod1, "Bravo", type3, mat1);

        Child childBike1 = new Child("P456", 459.00, prod1, "Kido", type1, mat1, 2);
        Child childBike2 = new Child("A345", 298.00, prod1, "Asid", type1, mat3, 2);
        Child childBike3 = new Child("D387", 199.00, prod2, "Bobo", type1, mat1, 4);
        Child childBike4 = new Child("O231", 537.00, prod2, "Jim", type1, mat2, 2);
        Child childBike5 = new Child("J505", 101.00, prod1, "Niko", type1, mat3, 4);

        //adding products to the Magazine
        Magazine magazine = new Magazine();
        magazine.addBike(bike1);
        //magazine.addBike(childBike1);

        System.out.println(bike1.getDetailsAsString());
        magazine.printBikes();
    }
}
