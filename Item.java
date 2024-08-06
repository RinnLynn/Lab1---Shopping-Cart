public class Item {
    private String itemName;
    private double itemPrice;
    private int bulkNum;
    private double bulkItemPrice;
    private boolean bulkStatus;
    
    public Item(String name, double price) {
        itemName = name;
        itemPrice = price;
        bulkStatus = false; 
    }

    public Item(String name, double price, int bulkQty, double bulkPrice){
        this(name,price);
        bulkNum = bulkQty;
        bulkItemPrice = bulkPrice;
        bulkStatus = true;
        if (itemPrice < 0 || bulkNum < 0 || bulkItemPrice < 0) throw new IllegalArgumentException("error");
    }

    public double priceFor(int quantity){
        if (quantity < 0) {throw new IllegalArgumentException("quantity cannot be negative");}
        if (bulkStatus == true&&quantity>=bulkNum){
            return bulkItemPrice*quantity;
        }
        else {
            return itemPrice*quantity;
        }
        
    }
    @Override
    public boolean equals(Object obj){
        if (obj.equals(this.itemName)){
            return true; 
        }
        return false; 
    }
    @Override
    public String toString(){
        return itemName + ", $" + itemPrice;
    }
}



