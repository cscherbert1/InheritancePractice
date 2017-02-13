package inheritancepractice;

public class CuttingImplement extends Tool{
    private String substancesEasilyCutThrough;
    private boolean isSharp;
    
    public void cut(String cuttingTarget){
        
        System.out.println("This tool is crudely cutting " + cuttingTarget);
    }
    
    public void sharpen(){
        System.out.println("You have sharpened your tool.");
        isSharp = true;
    }
    
    public String getSubstancesEasilyCutThrough() {
        return substancesEasilyCutThrough;
    }

    public void setSubstancesEasilyCutThrough(String substancesEasilyCutThrough) {
        this.substancesEasilyCutThrough = substancesEasilyCutThrough;
    }

    public boolean isIsSharp() {
        return isSharp;
    }

    public void setIsSharp(boolean isSharp) {
        this.isSharp = isSharp;
    }
    
    
}
