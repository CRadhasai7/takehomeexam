package takehometest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class Test_Exam {
	
	private Inventory itemn;
	
	private Inventory spyitemen;
	
	private InventoryItem mockItem;
	

	@BeforeEach
	void setUp() throws Exception {
		
	itemn = new Inventory();
	Inventory itemn1 = new Inventory();
	spyitemen = spy(itemn1);
	mockItem = mock(InventoryItem.class);
		
	}

	@Test
	void test_addItem_To_Inventory() {
		
		when(mockItem.getWeight()).thenReturn(249);
		
		boolean expected_result = spyitemen.addItemToInventory(mockItem);
		
		assertTrue(expected_result, "Item is not added");
		
		assertEquals(1, spyitemen.items.size(), "The item is not added to inventory");
		
		
	}
	
	@Test
	void test_dropInventory()
	{
		InventoryItem item1 =new InventoryItem("car",249, "Honda civic", 10);
		itemn.addItemToInventory(item1);
		
		assertEquals(1,itemn.items.size(), "There are no items in the inventory");
		
		boolean expected_result = itemn.dropInventoryItem(item1);
		
		assertTrue(expected_result,"not able to find in the inventory");
		
	}
	
	@Test
	
	void test_TOstring()
	{
		InventoryItem item2 =new InventoryItem("baseball",249,"baseballbats", 10);
		itemn.addItemToInventory(item2);
		
		String expected = "Your inventory has:\n" + item2.toString();
		String actual = itemn.toString();
		
		assertEquals(expected, actual, " in valid");
		
		
	}
	

}
