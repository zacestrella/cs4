/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adahestrella
 */
public class WaterTank {
 String owner;
 double funds, amountFilled;
    
    public WaterTank(String o, double funds){
        this.owner = o;
        this.funds = funds;
        this.amountFilled = 0.0;
    }
    
    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    
    public double getFunds(){
        return funds;
    }
    
        public void setFunds(double funds) {
        this.funds = funds;
    }
    
    public void getAmountFilled(){
        System.out.println(amountFilled);
    }
    
    public void setAmountFilled(double amountFilled) {
        this.amountFilled = amountFilled;
    }
        
    public void addAmountFilled(double d){
        this.amountFilled += d;
    }
    
    public void fill(WaterStation s, double volume){
        double cost = s.getRatePerLiter()*volume;
        if(funds <= cost){
            funds -= cost;
            this.amountFilled += volume;
            s.addEarnings(cost);
            System.out.println(owner + " spent " + cost + " and filled tank by " + volume + "L from " + s.getName() + ".");
        }
        else{
            System.out.println(owner + " didn't have enough money to fill the tank from " + s.getName() + ".");
        }
    }
    public void displayStats(){
        System.out.printf("Owner: ", owner);
        System.out.printf("Funds: ", funds);
        System.out.printf("Amount filled: ", amountFilled);
    }
}