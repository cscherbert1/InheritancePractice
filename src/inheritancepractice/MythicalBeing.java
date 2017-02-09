
package inheritancepractice;

public class MythicalBeing {
    private String domainOfInfluence;
    private int numberOfBelievers;
    
    public void inspireFollowers(){
        System.out.println("Thy Followers have been inspired");
    }

    public String getDomainOfInfluence() {
        return domainOfInfluence;
    }

    public void setDomainOfInfluence(String domainOfInfluence) {
        this.domainOfInfluence = domainOfInfluence;
    }

    public int getNumberOfBelievers() {
        return numberOfBelievers;
    }

    public void setNumberOfBelievers(int numberOfBelievers) {
        this.numberOfBelievers = numberOfBelievers;
    }
    
    
}
