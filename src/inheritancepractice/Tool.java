package inheritancepractice;

public class Tool {
    private int numberOfHandsNeededToOperate;
    private String functionServed;
    
    public void makeTaskEasier(){
        System.out.println("This tool makes tasks related to " + getFunctionServed() +
                " much easier.");
    }

    public int getNumberOfHandsNeededToOperate() {
        return numberOfHandsNeededToOperate;
    }

    public void setNumberOfHandsNeededToOperate(int numberOfHandsNeededToOperate) {
        this.numberOfHandsNeededToOperate = numberOfHandsNeededToOperate;
    }

    public String getFunctionServed() {
        return functionServed;
    }

    public void setFunction(String function) {
        this.functionServed = function;
    }
    
    
}
