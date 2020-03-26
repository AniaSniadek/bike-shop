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

    public void findBikeByProducer(String producer){
        Vector<Bike> copyBikeList = new Vector<Bike>();
        for(Bike p : bikeList){
            if(p.getProducerName().equals(producer)){
                copyBikeList.add(p);
            }
        }
        if(copyBikeList.isEmpty()){
            System.out.println("There is no bike from this producer in the stock");
        } else {
            for(Bike p : copyBikeList){
                System.out.println(p.getDetailsAsString());
            }
        }
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
