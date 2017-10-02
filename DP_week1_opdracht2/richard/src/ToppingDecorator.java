// the Decorator
abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;

    protected String size;
    protected double cost;
    
    public ToppingDecorator(Pizza newPizza){

        tempPizza = newPizza;
        this.setSize(newPizza.getSize());
    }
    
    public String getDescription() {
        
        return tempPizza.getDescription();
    }

    public double getCost() {
        
        return tempPizza.getCost();
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getSize() {
        return this.size;
    }
}
