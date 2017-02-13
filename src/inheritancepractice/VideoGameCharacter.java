
package inheritancepractice;


public class VideoGameCharacter {
    private boolean canFight;
    private int maximumRange;
    private int maxHealth;
    
    //in actual program, items would be objects passed into this method. 
    public void equipItems(){
        System.out.println("Item equipped.");
    }

    public boolean isCanFight() {
        return canFight;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    public int getMaximumRange() {
        return maximumRange;
    }

    public void setMaximumRange(int maximumRange) {
        this.maximumRange = maximumRange;
    }
        
    
    
    
}
