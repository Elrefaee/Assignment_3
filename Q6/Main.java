package Q6;

public class Main {
    public static void main(String[] args){
        GroceryList Total = new GroceryList();
        GroceryItemOrder x = new GroceryItemOrder("cookies",2.30f);
        x.setQuantity(4);
        Total.add(x);
        System.out.println(Total.getTotalCost());
    }
}
