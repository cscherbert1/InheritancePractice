
package inheritancepractice;

/**
 *
 * @author cscherbert1
 */
public class Knife extends CuttingImplement{

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public Boolean getLegalWhenConcealed() {
        if(bladeLength <= 3){
            legalWhenConcealed = true;
        } else {
            legalWhenConcealed = false;
        }
        return legalWhenConcealed;
    }

    private double bladeLength;
    private Boolean legalWhenConcealed;
    
    @Override
    public void cut(String cuttingTarget){
        System.out.println("This tool is precicely cutting " + this.getCuttingTarget());
    }
}
