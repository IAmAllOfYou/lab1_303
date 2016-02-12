package labtest01;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class Corporation
{
	private static Map<String, Inventory> aInventories = null;
	
	 private static Corporation singleton = new Corporation( );
	   
	   /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	   private Corporation(){ }
	   
	   /* Static 'instance' method */
	   public static Corporation getInstance( ) {
	      return singleton;
	   }
	
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}
	
}
