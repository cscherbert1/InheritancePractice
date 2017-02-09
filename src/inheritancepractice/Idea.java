
package inheritancepractice;


public class Idea {
    private String purposeOfIdea;
    private String ownerOfIdea;
    
    public void inpsire(){
        System.out.println("I have a plan. Here it is: " + getPurposeOfIdea());
    }

    public String getPurposeOfIdea() {
        return purposeOfIdea;
    }

    public void setPurposeOfIdea(String purposeOfIdea) {
        this.purposeOfIdea = purposeOfIdea;
    }

    public String getOwnerOfIdea() {
        return ownerOfIdea;
    }

    public void setOwnerOfIdea(String ownerOfIdea) {
        this.ownerOfIdea = ownerOfIdea;
    }
    
    
    
}
