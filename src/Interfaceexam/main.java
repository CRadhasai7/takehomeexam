package Interfaceexam;


import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<BakedGoods> bakedgoods_list= new ArrayList<BakedGoods>();
		
		Cookie cookie = new Cookie(2, "cookie - contains blueberries and choco chips" , "07/15/2020");
		bakedgoods_list.add(cookie);
		
		CinnamonRoll cinnamonroll = new CinnamonRoll(7, "cinnamon roll - contains cinamon, sugar and flour", "05/31/2019");
		bakedgoods_list.add(cinnamonroll);
		
		Brownie brownie = new Brownie(4, "brownie - contains dark choclate and flour ", "08/09/2019");
		bakedgoods_list.add(brownie);
		
		for(BakedGoods bg :bakedgoods_list)
		{
			System.out.printf("The Price is %d dollors \n",bg.getPrice());
			System.out.println("The Description:  " + bg.getDescription());
			System.out.println("The SellByDate:  " + bg.getSellByDate());
			
			
			
		}
		
		
		

	}

}