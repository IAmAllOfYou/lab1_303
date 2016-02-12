package labtest01;

import java.util.Comparator;

/**
 * An item in a grocery store: 
 * Jar of peanut butter, package of pasta,
 * whatever.
 */
public class Item implements Cloneable,Comparator<Item>
{
	private final String aName;
	private final int aId;
	private final int aPrice; // In cents: 100 = one dollar
	
	/**
	 * Creates a new item.
	 * @param pName The name of the item. Not necessarily unique.
	 * @param pId A unique id for the item
	 * @param pPrice The price of the item in cents
	 */
	public Item(String pName, int pId, int pPrice)
	{
		aName = pName;
		aId = pId;
		aPrice = pPrice;
	}
	
	/**
	 * @return The name of the item
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * @return The ID of the item.
	 */
	public int getId()
	{
		return aId;
	}
	
	/**
	 * @return The price of the item in cents
	 */
	public int getPrice()
	{
		return aPrice;
	}
	
	@Override
	public Item clone()
	{
		try
		{
			return (Item)super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			return null;
		}
	}

	public static Comparator<Item> getPriceComparator()
	{
		return new Comparator<Item>()
		{
			@Override
			public int compare(Item o1, Item o2)
			{
				if(o1.getPrice() > o2.getPrice())
				{
					return o1.getPrice() - o2.getPrice();
				}
				else
				{
					return o2.getPrice() - o1.getPrice();
				}
			}
		};
	}

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		if(o1.getPrice() > o2.getPrice())
		{
			return o1.getPrice() - o2.getPrice();
		}
		else
		{
			return o2.getPrice() - o1.getPrice();
		}
	}
}
