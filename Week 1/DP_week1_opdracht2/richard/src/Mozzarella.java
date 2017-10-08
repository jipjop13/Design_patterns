// a Concrete Decorator
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        
        super(newPizza);
        this.setCost(0.50);
        System.out.println("Adding Mozzarella");
    }
    
    public String getDescription() {
        
        return tempPizza.getDescription() + ", mozzarella";
    }
    
    public double getCost() {
        
        System.out.println("Cost of mozzarella: " + cost);
        System.out.println("Size modifier of mozzarella: " + this.sizeModifier());
        return tempPizza.getCost() + this.cost + this.sizeModifier();
    }

    @Override
    public double sizeModifier() {
        String toppingSize = this.getSize();

        if(toppingSize.equals("S")) {
            return 0.0;
        } else if(toppingSize.equals("M")) {
            return 0.2;
        } else if(toppingSize.equals("L")) {
            return 0.3;
        }

        return 0;
    }
}
