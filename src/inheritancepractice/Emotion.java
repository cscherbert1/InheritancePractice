
package inheritancepractice;

public class Emotion {
    private String trigger;
    private String physicalResponse;
    
    public void feel(){
        System.out.println("You feel a feeling.");
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
}
