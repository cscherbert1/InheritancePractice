
package inheritancepractice;

public class MythicalBeing {
    private String domainOfInfluence;
    private int numberOfBelievers;
    private boolean isGood;
    
    public void inspireFollowers(){
        if (isGood){
           System.out.println("Thy Followers have been inspired"); 
        } else {
            System.out.println("They do evil in your name, m'Lord.");
        }  
    }

    public boolean isIsGood() {
        return isGood;
    }

    public void setIsGood(boolean isGood) {
        this.isGood = isGood;
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
