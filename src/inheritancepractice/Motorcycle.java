
package inheritancepractice;

public class Motorcycle extends WheeledVehicle{
    public boolean hasNoPedals;
    
    
    public void startMotorcycle(){
        System.out.println("Motorcycle has started");
    }

    public boolean isHasNoPedals() {
        return hasNoPedals;
    }

    public void setHasNoPedals(boolean hasNoPedals) {
        this.hasNoPedals = hasNoPedals;
    }

}
