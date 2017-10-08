// the Decorator
abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;
    
    public ToppingDecorator(Pizza newPizza){

        tempPizza = newPizza;
    }
    
    public String getDescription() {
        
        return tempPizza.getDescription();
    }

    public double getCost() {
        
        return tempPizza.getCost();
    }

    @Override
    public void setSize(String size) {
        tempPizza.setSize(size);
    }

    @Override
    public String getSize() {
        return tempPizza.getSize();
    }

    public double getMultiplier(){
        if(tempPizza.getSize().equals("S")){
            return 1.0;
        }else if(tempPizza.getSize().equals("M")){
            return 1.1;
        }else if(tempPizza.getSize().equals("L")){
            return 1.2;
        }else{
            System.out.println("Unknown size");
            return 1.0;
        }
    }
}
