
package inheritancepractice;

public class House extends WalledStructure{
    private int numberOfRooms;
    private String address;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
        public void provideShelter(){
        System.out.println("Between 1 - 10, shelter provided is 10.");
    }
    
}
