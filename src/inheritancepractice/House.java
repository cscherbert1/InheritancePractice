
package inheritancepractice;

public class House extends WalledStructure{
    private int numberOfRooms;
    private String mailingAddress;
    
    @Override
    public void provideShelter(){
        System.out.println("Between 1 - 10, shelter provided is 10.");
    }    

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }  
}
