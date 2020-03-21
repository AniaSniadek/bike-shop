import java.util.Vector;

public class Magazine {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    static Vector<Bike> bikeList = new Vector<Bike>();

    public Vector<Bike> getBikeList() {
        return bikeList;
    }

    public void addBike(Bike bike){
        bikeList.add(bike);
    }

    public int findIndex(String number){
        for(int i = 0; i < bikeList.size(); i++){
            if(bikeList.contains(number)){
                System.out.println("Bike with this number has been found:");
                return i;
            }
        }
        System.out.println("There is no bike with this number in the system.");
        return -1;
    }

    public Bike getBikeWithIndex(int index){
        return bikeList.elementAt(index);
    }

//    public Vector<Bike> findBike(BikeDetails findDetails){
//        Vector<Bike> matchingBikes = new Vector<Bike>();
//        for(Bike p : bikeList){
//            if(p.getDetails() == findDetails){
//                matchingBikes.add(p);
//            }
//        }
//        return matchingBikes;
//    }

    public void printBikes(){
        System.out.println(ANSI_RED + "List of bikes in the system:" + ANSI_RESET);
        for(Bike p : bikeList){
            System.out.println(p.getDetailsAsString());
        }
    }
}
