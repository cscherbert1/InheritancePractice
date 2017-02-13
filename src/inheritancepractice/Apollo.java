
package inheritancepractice;

public class Apollo extends GreekGod{
    private boolean hasBow;
    private int numberOfArrows;
    
    public void protectFromEvil(){
        System.out.println("Fear not. You are protected");
    }

    public boolean isHasBow() {
        return hasBow;
    }

    public void setHasBow(boolean hasBow) {
        this.hasBow = hasBow;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
     
    
}
