
package inheritancepractice;

public class Fear extends NegativeEmotion{
    private boolean isRational;
    
    @Override
    public void setNameOfEmotion(String nameOfEmotion) {
        super.setNameOfEmotion(nameOfEmotion);
        nameOfEmotion = "Fear";
    }
    
    public void paralyzeInFear(){
        System.out.println("You can't move.");
    }

    
}
