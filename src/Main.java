import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    //preparing the store environment
    private static final Producer prod1 = new Producer("Kross");
    private static final Producer prod2 = new Producer("Author");

    private static final Type type1 = new Type("trekking");
    private static final Type type2 = new Type("bicyclist");
    private static final Type type3 = new Type("mountain");

    private static final Material mat1 = new Material("aluminium");
    private static final Material mat2 = new Material("steel");
    private static final Material mat3 = new Material("carbon");

    //creating products
    private static Adult bike1 = new Adult("M945", 980.00, prod1, "Navigto", type1, mat1);
    private static Adult bike2 = new Adult("G570", 799.00, prod2, "Kim", type1, mat2);
    private static Adult bike3 = new Adult("P456", 459.00, prod1, "Jasen", type2, mat2);
    private static Adult bike4 = new Adult("S909", 1000.00, prod2, "Olsen", type3, mat3);
    private static Adult bike5 = new Adult("F538", 999.00, prod1, "Bravo", type3, mat1);

    private static Child childBike1 = new Child("P456", 459.00, prod1, "Kido", type1, mat1, 2);
    private static Child childBike2 = new Child("A345", 298.00, prod1, "Asid", type1, mat3, 2);
    private static Child childBike3 = new Child("D387", 199.00, prod2, "Bobo", type1, mat1, 4);
    private static Child childBike4 = new Child("O231", 537.00, prod2, "Jim", type1, mat2, 2);
    private static Child childBike5 = new Child("J505", 101.00, prod1, "Niko", type1, mat3, 4);

    private static Magazine magazine = new Magazine();

    public static void main(String[] args) {

        //adding products to the Magazine
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

        boolean quit = false;

        printMenu();
        if(scanner.hasNextInt()){
            while (!quit){
                try{
                    int action = scanner.nextInt();
                    scanner.nextLine();
                    switch(action) {
                        case 0:
                            quit = true;
                            break;
                        case 1:
                            magazine.printBikes();
                            menu();
                            break;
                        case 2:
                            printBikeByNumber();
                            menu();
                            break;
                        case 3:
                            changePrice();
                            menu();
                            break;
                        case 4:
                            findProducer();
                            menu();
                            break;
                        case 5:
                            printMenu();
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println(Colors.ANSI_RED + "Invalid input!" + Colors.ANSI_RESET);
                    System.exit(0);
                }
                }
        } else {
            System.out.println(Colors.ANSI_RED + "Invalid input!" + Colors.ANSI_RESET);
            System.exit(0);
        }
    }

    private static void printBikeByNumber(){
        System.out.println("Enter the bike number which you are looking for:");
        String number = scanner.nextLine();
        int bikeIndex = magazine.findIndex(number);
        if(bikeIndex == -1){
            System.out.println("There is no bike with this number in stock.");
        } else {
            Bike foundedBike = magazine.getBikeWithIndex(bikeIndex);
            System.out.println("Bike with this number has been found:");
            System.out.println(foundedBike.getDetailsAsString());
        }
    }

    private static void changePrice() {
        System.out.println("Enter the number of the bike you want to change the price:");
        String number = scanner.nextLine();
        int bikeIndex = magazine.findIndex(number);
        if(bikeIndex == -1){
            System.out.println("There is no bike with this number in stock.");
        } else {
            Bike foundedBike = magazine.getBikeWithIndex(bikeIndex);
            System.out.println("Write a new price:");
            try {
                double price = scanner.nextDouble();
                foundedBike.setPrice(price);
                System.out.println("Bike details after changing price:");
                System.out.println(foundedBike.getDetailsAsString());
            } catch (InputMismatchException e){
                System.out.println(Colors.ANSI_RED + "Invalid input!" + Colors.ANSI_RESET);
                System.exit(0);
            }

        }
    }

    private static void findProducer(){
        System.out.println("Enter the name of the Producer:");
        String name = scanner.nextLine();
        magazine.findBikeByProducer(name);
    }

    private static void printMenu(){
        System.out.println("Available actions:\nPress ");
        System.out.println("0 - To quit\n" +
                "1 - To display all bikes in the system\n" +
                "2 - To display bike by serial number\n" +
                "3 - To change the price of the bike\n" +
                "4 - To display all bikes from one producer\n" +
                "5 - To print menu options\n" +
                "---------------------------------------");
    }

    private static void menu() {
        System.out.println(Colors.ANSI_RED + "\nPlease press 5 to print menu options!" + Colors.ANSI_RESET);
    }
}
