
package inheritancepractice;


public class WalledStructure extends Structure{
    
    private int numberOfWalls;
    private boolean hasDoor;

    public boolean isHasDoor() {
        return hasDoor;
    }

    public void setHasDoor(boolean hasDoor) {
        this.hasDoor = hasDoor;
    }

    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    public void setNumberOfWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }
    
    @Override
    public void provideShelter(){
        System.out.println("Between 1 - 10, shelter provided is 5.");
    }
    
}
