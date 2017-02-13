package inheritancepractice;

public class Knife extends CuttingImplement{
    
    private double bladeLength;
    private Boolean legalWhenConcealed;
    
    public void compareToCrocDundee(){
        if (bladeLength < 13){
            System.out.println("That's not a knife...");
        } else {
            System.out.println("Now That's a knife!");
        }
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public Boolean getLegalWhenConcealed() {
        return legalWhenConcealed;
    }

    public void setLegalWhenConcealed(Boolean legalWhenConcealed) {
        this.legalWhenConcealed = legalWhenConcealed;
    }   
}
