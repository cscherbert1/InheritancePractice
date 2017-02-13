
package inheritancepractice;

public class Emotion {
    private String trigger;
    private String physicalResponse;
    //either negative or positive emotion
    private boolean isPositive;
    
    public void feel(){
        if (isPositive){
            System.out.println("You feel a good feeling.");
        } else {
            System.out.println("You feel a bad feeling.");
        }  
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public String getPhysicalResponse() {
        return physicalResponse;
    }

    public void setPhysicalResponse(String physicalResponse) {
        this.physicalResponse = physicalResponse;
    }

    public boolean isIsPositive() {
        return isPositive;
    }

    public void setIsPositive(boolean isPositive) {
        this.isPositive = isPositive;
    }
    
    
}
