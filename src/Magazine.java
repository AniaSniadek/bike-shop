import java.util.Vector;

public class Magazine {

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
        System.out.println("List of bikes in the system:");
        for(Bike p : bikeList){
            System.out.println(p.getDetailsAsString());
        }
    }
}
