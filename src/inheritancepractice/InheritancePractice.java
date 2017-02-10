package inheritancepractice;

/**
 *
 * @author cscherbert1
 */
public class InheritancePractice {

    public static void main(String[] args) {
        //knife
        System.out.println("Knife: ");
        Knife knife = new Knife();
        knife.setNumberOfHandsNeededToOperate(1);
        knife.setBladeLength(3);
        
        System.out.println("Is legal: " + knife.getLegalWhenConcealed());
        //output says "Tool is precicely cutting null. 
        knife.cut("fruit");
        
        System.out.println("\nHouse:");
        House house = new House();
        house.setNumberOfWalls(4);
        house.setNumberOfRooms(1);
        house.setAddress("123 N Main St.");
        
        System.out.println(house.getNumberOfWalls());
        System.out.println(house.getNumberOfRooms());
        System.out.println(house.getAddress());
        
        System.out.println("\nMotorcycle");
        Motorcycle mc = new Motorcycle();
        mc.setNumberOfWheels(2);
        mc.setNumberOfOccupants(1);
        mc.setPowerSource("Engine");
        mc.startMotorcycle();
        mc.move();
        //broken below: 
//        System.out.println("Wheels: " + mc.getNumberOfWheels());
//        System.out.println("Occupants: " + mc.getNumberOfOccupants());
        
        System.out.println("\nAppollo");
        Appollo appollo = new Appollo();
        appollo.setParents("Zeus and Leto");
        System.out.println(appollo.getParents());
        appollo.inspireFollowers();
        appollo.meddleWithMortals();
    }
    
}
