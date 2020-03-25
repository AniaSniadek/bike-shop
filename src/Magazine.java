import java.util.Vector;

public class Magazine {

    static Vector<Bike> bikeList = new Vector<Bike>();

    public void addBike(Bike bike){
        bikeList.add(bike);
    }

    public int findIndex(String number){
        for(Bike p : bikeList){
            if(p.getNumber().equals(number)){
                return bikeList.indexOf(p);
            }
        }
        return -1;
    }

    public Bike getBikeWithIndex(int index){
        return bikeList.elementAt(index);
    }


    public void printBikes(){
        System.out.println("List of bikes in the system:");
        for(Bike p : bikeList){
            System.out.println(p.getDetailsAsString());
        }
    }
}
