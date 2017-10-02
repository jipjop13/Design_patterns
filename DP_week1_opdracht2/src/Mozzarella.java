// a Concrete Decorator
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        
        super(newPizza);
        System.out.println("Adding Mozzarella");
    }
    
    public String getDescription(){
        
        return tempPizza.getDescription() + ", mozzarella";
    }
    
    public double getCost(){

        double mozzarellacost = (0.50 * tempPizza.getMultiplier());
        
        System.out.println("Cost of mozzarella: " + mozzarellacost);
        return tempPizza.getCost() + mozzarellacost;
    }
}
