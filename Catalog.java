import java.util.*;

/**
 * Write a description of class Catalog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Catalog
{
    // instance variables - replace the example below with your own
    private String catalogName;
    private ArrayList<Item> catalogList = new ArrayList<Item>(); 
    /**
     * Constructor for objects of class Catalog
     */
    public Catalog(String name)
    {
        // initialise instance variables
        catalogName = name; 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void add(Item item)
    {
        catalogList.add(item);
    }
    public int size(){
        return catalogList.size();
    }
    public Item get(int index){
        return catalogList.get(index);
    }
    public String getName(){
        return catalogName; 
    }
}
