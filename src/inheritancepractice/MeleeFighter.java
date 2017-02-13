
package inheritancepractice;

import java.util.ArrayList;

public class MeleeFighter extends VideoGameCharacter{
    private String usableMeleeWeapons;
    private boolean wearsHeavyArmor; //if false, wears Medium armor
    
    public void slashAbility(){
        System.out.println("Visiously slash at your enemy using your melee weapon");
    }

    public String getUsableMeleeWeapons() {
        return usableMeleeWeapons;
    }

    public void setUsableMeleeWeapons(String usableMeleeWeapons) {
        this.usableMeleeWeapons = usableMeleeWeapons;
    }

    public boolean isWearsHeavyArmor() {
        return wearsHeavyArmor;
    }

    public void setWearsHeavyArmor(boolean wearsHeavyArmor) {
        this.wearsHeavyArmor = wearsHeavyArmor;
    }
    
    
    
    
    
    
    

}
