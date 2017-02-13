
package inheritancepractice;

public class Structure {
    private String timeNeededToBuild;
    private String materialsComprisedOf;
    private Boolean isPermenant;
    
    public void provideShelter(){
        System.out.println("Between 1 - 10, shelter provided is 1.");
    }
    
    public void buildStructure(){
        System.out.println("Structure complete in " + timeNeededToBuild);
    }

    public Boolean getIsPermenant() {
        return isPermenant;
    }

    public void setIsPermenant(Boolean isPermenant) {
        this.isPermenant = isPermenant;
    }

    public String getTimeNeededToBuild() {
        return timeNeededToBuild;
    }

    public void setTimeNeededToBuild(String timeNeededToBuild) {
        this.timeNeededToBuild = timeNeededToBuild;
    }

    public String getMaterialsComprisedOf() {
        return materialsComprisedOf;
    }

    public void setMaterialsComprisedOf(String materialsComprisedOf) {
        this.materialsComprisedOf = materialsComprisedOf;
    }
}
