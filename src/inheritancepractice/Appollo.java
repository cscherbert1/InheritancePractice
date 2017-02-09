
package inheritancepractice;

public class Appollo extends GreekGod{

    @Override
    public void setParents(String parents) {
        super.setParents(parents); 
        parents = "Zeus and Leto";
    }
    
    @Override
    public void setSymbol(String symbol) {
        super.setSymbol(symbol);
        symbol = "Bow and Arrow";
    }
    
    public void protectFromEvil(){
        System.out.println("Fear not. You are protected");
    }
     
}
