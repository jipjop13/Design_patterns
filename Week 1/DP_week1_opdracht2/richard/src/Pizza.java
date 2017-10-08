// the Component
public interface Pizza {

    public String getDescription();

    public double getCost();
    public void setCost(double cost);

    public void setSize(String size);
    public String getSize();

    public double sizeModifier();
}
