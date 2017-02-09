package inheritancepractice;

/**
 *
 * @author cscherbert1
 */
public class Tool {
    private int numberOfHandsNeededToOperate;
    private String functionServed;
    
    public void makeTaskEasier(){
        System.out.println("This tool makes tasks related to " + getFunction() +
                " much easier.");
    }

    public int getNumberOfHandsNeededToOperate() {
        return numberOfHandsNeededToOperate;
    }

    public void setNumberOfHandsNeededToOperate(int numberOfHandsNeededToOperate) {
        this.numberOfHandsNeededToOperate = numberOfHandsNeededToOperate;
    }

    public String getFunction() {
        return functionServed;
    }

    public void setFunction(String function) {
        this.functionServed = function;
    }
    
    
}
