// a Concrete Decorator
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {

        super(newPizza);
        System.out.println("Adding sauce, just sauce, real sauce, no ketchup");
    }
    
    public String getDescription(){
        
        return tempPizza.getDescription() + ", tomato sauce";
    }
    
    public double getCost(){

        double saucecost = (.35 * tempPizza.getMultiplier());

        System.out.println("Cost of sauce: " + saucecost);
        return tempPizza.getCost() + saucecost;
    }

}