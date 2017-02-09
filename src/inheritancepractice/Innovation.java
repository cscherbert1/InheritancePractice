
package inheritancepractice;

public class Innovation extends OriginalIdea{
    private String planOfAction;
    
    public void changeStatusQuo(){
        System.out.println("Out with the old and in with the new.");
    }

    public String getPlanOfAction() {
        return planOfAction;
    }

    public void setPlanOfAction(String planOfAction) {
        this.planOfAction = planOfAction;
    }
    
    
    
}
