package main_method;
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
import Product_model.customerModel;
import Product_model.orderModel;
import Product_model.productModel;
import product_service.customerServiceImpl;
import product_service.orderServiceImpl;
import product_service.productService;
import product_service.productServiceImpl;

public class clientApplication {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	
		 productServiceImpl ps= new productServiceImpl();
		 customerServiceImpl cs=new customerServiceImpl();
		// orderModel order=new orderModel();
		 orderServiceImpl order=new orderServiceImpl();
		 List<customerModel> customer=cs.getAllCustomer();
		
		List al= new ArrayList();
		List<productModel> list=ps.getAllProduct();
		 

		
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
					+ "7 View Customer \r\n"
					+ "8 Maintain purchase order of customer \r\n"
					+ "9 View individual custom orders \r\n"
					+ "10 View all customer reports\r\n"
					+ "11 Delete customer and its order \r\n"
					+ "12 Update customer orders \r\n"
					+ "13 exit");
			
				   System.out.println("Enter a choice number");
				   int ch=sc.nextInt();
				   switch(ch) {
				   
				   case 1:
					   System.out.print("Eneter a id :\t");
					   int id=sc.nextInt();
					   System.out.print("Eneter a price :\t");
					   int price=sc.nextInt();
					   System.out.print("Eneter a qty :\t");
					   int stock=sc.nextInt();
					   sc.nextLine();
					   System.out.print("Eneter a name:\t");
					   String name=sc.nextLine();
					   productModel model =new  productModel(id,price,stock,name);
					   
					   boolean b=ps.isAddNewProduct(model);
					   
					  if(b) {
						  System.out.println("product is added");
					  }else
					  {
						  System.out.println("not added");
					  }
					  break;
				   case 2: 
					   System.out.println("############# All products #################");
					  
					  for(Object obj :list) 
					  {
						productModel pmodel=(productModel)obj;
						System.out.println(pmodel.getId()+"\t"+pmodel.getName()+"\t"+pmodel.getPrice()+"\t"+pmodel.getStock());
						
					  }
					  System.out.println("###########################################");
					   
					   break;
				   case 3:
					   sc.nextLine();
					   System.out.println("search a product using  name :");
					    name=sc.nextLine();
					   productModel pm=ps.getProductByName(name);
					   
					   if(pm!=null)
					   {
						   System.out.println(pm.getId()+"\t"+pm.getName()+"\t"+pm.getPrice()+"\t"+pm.getStock());
					   }else
					   {
						   System.out.println("data not found ");
					   }
					   
					   break;
				   case 4:
					   
					   sc.nextLine(); 
					   
					    System.out.println("Enter the product name to delete: ");
					     name = sc.nextLine();
					    
					    boolean isDeleted = ps.isdeleteProduct(name);
					    
					    if (isDeleted) {
					        System.out.println("Product deleted successfully.");
					    } else {
					        System.out.println("Product not found.");
					    }
					    break;
				   case 5:
					   
					   System.out.println("All product Count is : "+ps.getCountAllProduct());
					   
				   break;
				   
				   case 6:
					   	System.out.println("Enter customer id: ");
					   	int cid=sc.nextInt();
					   	System.out.println("Eneter a customer name:");
					   	sc.nextLine();
					   	String cname=sc.nextLine();
					   	System.out.println("Eneter contact: ");
					
					   	long cphon=sc.nextInt();
					   	customerModel cmodel=new customerModel(cid,cname,cphon);
					 
					     b=cs.isAddNewCustomer(cmodel);
					     if(b)
					     {
					    	 System.out.println("added customer ");
					     }else
					     {
					    	 System.out.println("not added customer");
					     }
					   	
					   break;
				   case 7:
					     
					     for(customerModel cus:customer)
					     {
					    	 System.out.println(cus.getCid()+"\t"+cus.getCname()+"\t"+cus.getPhone());
					     }
					   break;
					  
				case 8:
					  
					    boolean flag=true;
					    System.out.println("Enter Customer Id: ");
					    cid=sc.nextInt();
					   
					    for(customerModel cus: customer)
					    {
					    	if(cid==cus.getCid())
					    	{
					    		String str="";
					    		flag=false;
					    		boolean flag1=true;
					    		do {
					    			
					    			for(productModel p: list)
					    			{
					    			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getPrice()+"\t"+p.getStock());
					    			}
					    			
					    			System.out.println("Enter Product Id");
					    			int pid=sc.nextInt();
					    			for(productModel p: list)
					    			{
					    			    if(pid==p.getId())
					    			    {
					    			    	System.out.println("Enter Order Id: ");
					    			    	int oid=sc.nextInt();
					    			    	
					    			    	System.out.println("Enter Qty: ");
					    			    	int qty=sc.nextInt();
					    			    	flag1=false;
					    			    	orderModel o=new orderModel(oid,qty,p);
					    			    	order.addProduct(o);
					    			    }
					    			}
					    			
					    			if(flag1)
					    			{
					    				
					    				System.out.println("product not found:");
					    			}
                                  sc.nextLine();
                                  System.out.println("You want continue:");
                                  str=sc.nextLine();
					    			
					    		}while(str.equals("yes"));
					    	}
					    }
					    
					    //List<orderModel> orderproduct=order.getOrderProduct();
					    customerModel cus=new customerModel();
					    
					    cus.setoModel(order.getOrderProduct());
					    List<orderModel> CustomerOrder=cus.getoModel();
					    for(customerModel cu: customer)
					    {
					       System.out.println(cu.getCid()+"\t"+cu.getCname()+"\t"+cu.getPhone());
					       
					      
					       for(orderModel co: CustomerOrder)
					       {
					    	   System.out.println(co.getPmodel().getId()+"\t"+co.getPmodel().getName()+"\t"+co.getPmodel().getPrice()+"\t"+co.getPmodel().getStock());
					       }
					    }
					    		
					break;
					 
				   case 12:
					   System.exit(ch);
					   break;
				   }

		}while(true);
		
		

		
		
		
	}
	
}
