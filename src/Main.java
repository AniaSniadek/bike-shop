import java.util.Scanner;

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
        magazine.addBike(bike2);
        magazine.addBike(bike3);
        magazine.addBike(bike4);
        magazine.addBike(bike5);
        magazine.addBike(childBike1);
        magazine.addBike(childBike2);
        magazine.addBike(childBike3);
        magazine.addBike(childBike4);
        magazine.addBike(childBike5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Show all bikes in stock? [Yes/No]");
        String question = scanner.nextLine();

        if(question.equals("Yes")){
            magazine.printBikes();
        } else {
            System.out.println("Do you want to search for a bike by serial number? [Yes/No]");
            String question2 = scanner.nextLine();
            if(question2.equals("No")){
                System.out.println("Thank you for using our program.");
                System.exit(0);
            } else if (!question2.equals("Yes")){
                System.out.println("Invalid input.");
                System.exit(0);
            }
        }

        System.out.println("Enter the bike number which you are looking for:");
        String number = scanner.nextLine();
        int bikeIndex = magazine.findIndex(number);
        if(bikeIndex == -1){
            System.out.println("There is no bike with this number in stock.");
        } else {
            Bike foundedBike = magazine.getBikeWithIndex(bikeIndex);
            System.out.println(foundedBike.getDetailsAsString());
            System.out.println("Do you want to change the price of this bike? [Yes/No]");
            String question2 = scanner.nextLine();
            if(question2.equals("Yes")){
                System.out.println("Write a new price:");
                int price = scanner.nextInt();
                foundedBike.setPrice(price);
                System.out.println("Bike details after changing price:");
                System.out.println(foundedBike.getDetailsAsString());
            } else if()
        }




        //magazine.printBikes();
    }
}
