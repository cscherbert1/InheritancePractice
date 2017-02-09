
package inheritancepractice;


public class TwoWheeledTransport extends Vehicle{
    private String powerSource;
    private Boolean hasSeat;
    

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public Boolean getHasSeat() {
        return hasSeat;
    }

    public void setHasSeat(Boolean hasSeat) {
        this.hasSeat = hasSeat;
    }  
    
    //trying to set the parent value for numWheels. Is this corect? guessing no. 
    @Override
    public int getNumberOfWheels() {
        this.setNumberOfWheels(2);
        return this.getNumberOfWheels();
    }
    
    
 
}
