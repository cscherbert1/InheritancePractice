
package inheritancepractice;

public class GreekGod extends MythicalBeing{
    private String symbol;
    private String patronOf;
    
    public void conveneOnOlympus(){
        System.out.println("It's a pretty tall mountain... Kind of a big deal.");
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPatronOf() {
        return patronOf;
    }
    
    public void setPatronOf(String patronOf) {
        this.patronOf = patronOf;
    }


}
