// a Concrete Component
public class PlainPizza implements Pizza {
    private String size;
    private double cost;

    public PlainPizza(String size) {
        this.size = size;
        this.cost = 4.00;
    }

    public String getDescription() {
        
        return "Just a plain pizza";
    }

    public double getCost() {

        System.out.println("Cost of plain pizza: " + this.cost);
        System.out.println("Added cost because of size: " + this.sizeModifier());
        return this.cost + this.sizeModifier();
    }

    @Override
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

    @Override
    public double sizeModifier() {
        String pizzaSize = this.getSize();

        if(pizzaSize.equals("S")) {
            return 0.0;
        } else if(pizzaSize.equals("M")) {
            return 0.5;
        } else if(pizzaSize.equals("L")) {
            return 1.0;
        }

        return 0;
    }
}
