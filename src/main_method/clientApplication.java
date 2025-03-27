package main_method;
import java.util.*;

import Product_model.productModel;
import product_service.productServiceImpl;

public class clientApplication {
	
	
	public static void main(String[] args) {
	
		 productServiceImpl ps= new productServiceImpl();
		 List al=ps.getProducts();
		 

		
		do{
			Scanner sc=new Scanner(System.in);
			
			System.out.println(""
					+ "\r\n"
					+ "1 Add Products in collection \r\n"
					+ "2 View All products in collection \r\n"
					+ "3 Search Product from collection \r\n"
					+ "4 Delete Product from collection\r\n"
					+ "5 Count total number of products from collection \r\n"
					+ "6 Create Customer collection \r\n"
					+ "7 Maintain purchase order of customer \r\n"
					+ "8 View individual custom orders \r\n"
					+ "9 View all customer reports\r\n"
					+ "10 Delete customer and its order \r\n"
					+ "11 Update customer orders \r\n"
					+ "");
				   System.out.println("Enter a choice number");
				   int ch=sc.nextInt();
				   switch(ch) {
				   case 1:
					   productModel pm=new productModel();
					   System.out.println("Eneter a id");
					   int id =sc.nextInt();
					   System.out.println("Eneter a price");
					   int price =sc.nextInt();
					   System.out.println("Eneter a qty");
					   int qty =sc.nextInt();
					  sc.nextLine();
					  System.out.println("Eneter a name");
					  String name=sc.nextLine();
					  pm.setId(id);
					  pm.setPrice(price);
					  pm.setQty(qty);
					  pm.setName(name);
					 ps.isAddNewProduct(pm);
					 
					 
					  break;
				   case 2:
					  
					   System.out.println("view all product in collection");
					  
					  for(Object obj:al)
					  {
						  productModel pp=(productModel)obj;
						  System.out.println(pp.getId()+"\t"+pp.getName()+" "+pp.getPrice()+"\t"+pp.getQty());
					  }
					   
					   break;
				   case 3:
					   break;
					   
				   
				   }
				   
		}while(true);
		
		

		
		
		
	}

}
