
package inheritancepractice;

public class GreekGod extends MythicalBeing{
    private String symbol;
    private String parents;
    
    public void meddleWithMortals(){
        System.out.println("They've angered us, most likely...");
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }

    @Override
    public void setDomainOfInfluence(String domainOfInfluence) {
        super.setDomainOfInfluence(domainOfInfluence); 
        domainOfInfluence = "Mount Olympus";
    }

}
