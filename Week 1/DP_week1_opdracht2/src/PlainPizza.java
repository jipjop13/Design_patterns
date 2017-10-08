// a Concrete Component
public class PlainPizza implements Pizza {

    private String size;

    public PlainPizza(String size){
        this.setSize(size);
    }
 
    public String getDescription() {
        
        return "Just a plain pizza";
    }

    public double getCost() {

        double plainpizzacost = (4.00 * this.getMultiplier());

        System.out.println("Cost of plain pizza: " + plainpizzacost);
        return plainpizzacost;
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
    public double getMultiplier() {
        if(this.getSize().equals("S")){
            return 1.0;
        }else if(this.getSize().equals("M")){
            return 1.1;
        }else if(this.getSize().equals("L")){
            return 1.2;
        }else{
            System.out.println("Unknown size");
            return 1.0;
        }
    }

}
