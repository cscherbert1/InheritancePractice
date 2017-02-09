
package inheritancepractice;

public class OriginalIdea extends Idea{
    private String howThisIsNew;
    

    @Override
    public void setOwnerOfIdea(String ownerOfIdea) {
        super.setOwnerOfIdea(ownerOfIdea); 
        ownerOfIdea = "Me!";
    }

    public String getHowThisIsNew() {
        System.out.println("Everyone else has done things one way. I will do it differently by: ");
        return howThisIsNew;
    }

    public void setHowThisIsNew(String howThisIsNew) {
        this.howThisIsNew = howThisIsNew;
    }

}
