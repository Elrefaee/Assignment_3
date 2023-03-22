package Q6;

public class GroceryItemOrder{
    private String name;
    private int quantity;
    private double pricePerUnit;
    public GroceryItemOrder (String name, double pricePerUnit){
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = 1;
    }
    public double getCost(){
        return pricePerUnit * quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
