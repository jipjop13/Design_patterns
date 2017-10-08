// a Concrete Decorator
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {

        super(newPizza);
        this.setCost(0.35);
        System.out.println("Adding sauce");
    }
    
    public String getDescription() {
        
        return tempPizza.getDescription() + ", tomato sauce";
    }
    
    public double getCost() {
        
        System.out.println("Cost of sauce: " + this.cost);
        System.out.println("Size modifier of sauce: " + this.sizeModifier());
        return tempPizza.getCost() + this.cost + this.sizeModifier();
    }

    @Override
    public double sizeModifier() {
        String toppingSize = this.getSize();

        if(toppingSize.equals("S")) {
            return 0.0;
        } else if(toppingSize.equals("M")) {
            return 0.15;
        } else if(toppingSize.equals("L")) {
            return 0.25;
        }

        return 0;
    }
}