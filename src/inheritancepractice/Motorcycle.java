
package inheritancepractice;

public class Motorcycle extends TwoWheeledTransport{
    


    @Override
    public void setPowerSource(String powerSource) {
        super.setPowerSource(powerSource);
        powerSource = "Combustion Engine";
    }
    
    public void startMotorcycle(){
        System.out.println("Motorcycle has started");
    }

}
