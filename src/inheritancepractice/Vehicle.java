
package inheritancepractice;

public class Vehicle {
    private int numberOfWheels;
    private int numberOfOccupants;
    
    public void move(){
        System.out.println("The vehicle is mooving.");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfOccupants() {
        return numberOfOccupants;
    }

    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }
}
