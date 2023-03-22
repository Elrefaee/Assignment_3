package Q6;
public class GroceryList {
    private GroceryItemOrder[] items;
    private int i;
    public GroceryList(){
        items = new GroceryItemOrder[10];
        i = 0;
    }
    public void add(GroceryItemOrder item){
        if(i < 10){
            items[i] = item;
            i++;
        }
    }
    public double getTotalCost(){
        double sum = 0.0;
        for(int j = 0; j < i; j++){
            sum += items[j].getCost();
        }
        return Math.round(sum * 100.0)/100.0;
    }
}
