
/**
 * Write a description of class ItemOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemOrder
{
    private int itemQty;
    private Item itemOrder; 
    
    /**
     * Constructor for objects of class ItemOrder
     */
    public ItemOrder(Item item, int qty)
    {
        itemQty = qty; 
        itemOrder = item; 
    }

    public double getPrice()
    {
        return itemOrder.priceFor(itemQty); 
    }
    public Item getItem(){
        return itemOrder;
    }
    public int getQty(){
        return itemQty;
    }
    @Override 
    public boolean equals(Object obj){
        if (obj.equals(this.itemOrder))
        {
            return true;
        }
        return false; 
    }
        
    
    
}
