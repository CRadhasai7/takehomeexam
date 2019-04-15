package takehometest;

import java.util.ArrayList;
import java.util.List;

public class Inventory 
{
	List<InventoryItem> items;
	int weight;
	
	
	
	public Inventory() 
	{
		weight = 0;
		items = new ArrayList<InventoryItem>();
	}


public boolean addItemToInventory(InventoryItem item) 
{
	if (weight + item.getWeight() > 250) 
	{
		return false;
	}
	weight += item.getWeight();
	items.add(item);
	return true;
	}


public boolean dropInventoryItem(InventoryItem i)
{
	if (items.contains(i)) {items.remove(i);
	return true;
}
	return false;
}

public int getWeight() 
{
	return weight; 
}

public int getCount() 
{
	return items.size(); 
}

public String toString() 
{
	String ret = "Your inventory has:\n";
	for (InventoryItem i : items)
	{
		ret = i.toString();
	}
	return "Your inventory has:\n" + ret;
	}

}