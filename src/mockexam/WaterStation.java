public class WaterStation {
    private String name;
    private double ratePerLiter;
    private double earnings;
    
    
    public WaterStation (String name, double ratePerLiter, double earnings){
        this.name = name;
        this.ratePerLiter = ratePerLiter;
        this.earnings = 0.0; 
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRatePerLiter() {
        return ratePerLiter;
    }

    public void setRatePerLiter(double ratePerLiter) {
        this.ratePerLiter = ratePerLiter;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public void addEarnings(double e){
        this.earnings += e;
    }
    
    public void displayStats(){
    System.out.printf("Name: %s %nRate Per L: %d %nEarnings: %d", this.name, this.ratePerLiter, this,earnings);
    }
    
    
}

