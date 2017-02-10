package inheritancepractice;

/**
 *
 * @author cscherbert1
 */
public class CuttingImplement extends Tool{
    private String substancesEasilyCutThrough;
    private String cuttingTarget;
    
    public void cut(String cuttingTarget){
        
        setCuttingTarget(cuttingTarget);
        System.out.println("This tool is crudely cutting " + getCuttingTarget());
    }
    
    public String getSubstancesEasilyCutThrough() {
        return substancesEasilyCutThrough;
    }

    public void setSubstancesEasilyCutThrough(String substancesEasilyCutThrough) {
        this.substancesEasilyCutThrough = substancesEasilyCutThrough;
    }

    public String getCuttingTarget() {
        return cuttingTarget;
    }

    public void setCuttingTarget(String cuttingTarget) {
        this.cuttingTarget = cuttingTarget;
    }
            
}
