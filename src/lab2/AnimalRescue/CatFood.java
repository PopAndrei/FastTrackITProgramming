package lab2.AnimalRescue;

public class CatFood {

    private String foodName;
    private int price;
    private int quantity;
    private boolean inStock;

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getFoodName() {
        return foodName;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public void setQuantity(int newQuantity){
        this.quantity=newQuantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setInStock(boolean newInStock){
        this.inStock=newInStock;
    }
    public boolean getInStock(){
        return inStock;
    }

}
