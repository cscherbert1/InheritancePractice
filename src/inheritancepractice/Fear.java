
package inheritancepractice;

public class Fear extends NegativeEmotion{
    private boolean isRational;
    private String sourceOfThreat;
        
    public void paralyzeInFear(){
        System.out.println("You can't move.");
    }

    public boolean isIsRational() {
        return isRational;
    }

    public void setIsRational(boolean isRational) {
        this.isRational = isRational;
    }

    public String getSourceOfThreat() {
        return sourceOfThreat;
    }

    public void setSourceOfThreat(String sourceOfThreat) {
        this.sourceOfThreat = sourceOfThreat;
    }

    
}
