
package inheritancepractice;


public class WheeledVehicle extends Vehicle{

    private int numberOfWheels;
    private boolean canOffRoad;
    private boolean hasTires;
    
    public void changeFlatTire(){
        if (hasTires){
            System.out.println("You have changed the flat");
        } else {
            System.out.println("You may need to consult a specialist.");
        }
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isCanOffRoad() {
        return canOffRoad;
    }

    public void setCanOffRoad(boolean canOffRoad) {
        this.canOffRoad = canOffRoad;
    }

    public boolean isHasTires() {
        return hasTires;
    }

    public void setHasTires(boolean hasTires) {
        this.hasTires = hasTires;
    }
    
    
    
    

 
    

    
    
 
}
