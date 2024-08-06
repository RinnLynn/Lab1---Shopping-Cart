import java.util.*;

/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<ItemOrder> cart;
    private double totalCost = 0;
    /**
     * Constructor for objects of class ShoppingCart
     */
    public ShoppingCart()
    {
        cart = new ArrayList<ItemOrder>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void add(ItemOrder newOrder)
    {
        
        
        for (int i = 0; i < cart.size(); i++){
            // if (newOrder.getQty() <= 0)
            // {
                // cart.remove(newOrder.getItem());
                // return;
            // }
            if (cart.get(i).equals(newOrder)){
                if (newOrder.getQty() == 0){
                    cart.remove(i);
                }
                else{
                cart.set(i, newOrder);
                return; 
                }
            }
            
        }
        
        cart.add(newOrder);
        
    }
    
    public double getTotal()
    {
        totalCost = 0;
        //System.out.print("the cart size get total" + cart.size());
        for (int i =0; i < cart.size(); i++){
            totalCost = totalCost + cart.get(i).getPrice();
        }
        
        return totalCost; 
    }
}
