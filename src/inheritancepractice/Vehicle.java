
package inheritancepractice;

public class Vehicle {
    private int numberOfOccupants;
    private String powerSource;
    
    public void move(){
        System.out.println("The vehicle is mooving.");
    }

    public int getNumberOfOccupants() {
        return numberOfOccupants;
    }

    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
    
}
