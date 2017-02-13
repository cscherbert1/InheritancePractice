
package inheritancepractice;

public class Knight extends MeleeFighter{
    private String usableShields;
    private int bonusArmorForKnights;
    
    public void defendAllies(){
        System.out.println("I will protect you.");
    }

    public String getUsableShields() {
        return usableShields;
    }

    public void setUsableShields(String usableShields) {
        this.usableShields = usableShields;
    }

    public int getBonusArmorForKnights() {
        return bonusArmorForKnights;
    }

    public void setBonusArmorForKnights(int bonusArmorForKnights) {
        this.bonusArmorForKnights = bonusArmorForKnights;
    }
    
    
    
    
}
