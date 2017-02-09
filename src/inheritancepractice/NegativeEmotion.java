
package inheritancepractice;

public class NegativeEmotion extends Emotion{
    private int strengthOfEmotion;
    private String nameOfEmotion;
    
    public void ruinDay(){
        System.out.println("Everything is no good, very bad, and horrible.");
    }

    public int getStrengthOfEmotion() {
        return strengthOfEmotion;
    }

    public void setStrengthOfEmotion(int strengthOfEmotion) {
        this.strengthOfEmotion = strengthOfEmotion;
    }

    public String getNameOfEmotion() {
        return nameOfEmotion;
    }

    public void setNameOfEmotion(String nameOfEmotion) {
        this.nameOfEmotion = nameOfEmotion;
    }
    
    
}
