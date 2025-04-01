package Product_repo;
import java.util.*;

import Product_model.productModel;

public  class productRepositoryImpl implements productRepository {
	public static  List ProdList=new ArrayList();
	
	@Override
	public  boolean isaddProduct(productModel product) {
		
		
		return ProdList.add(product);
	}

	

	@Override
	public List getAllProduct() {
		// TODO Auto-generated method stub
		return ProdList;
	}



	@Override
	public productModel getProductByName(String name) {
	
		for(Object obj:ProdList)
		{
			productModel pmodel=(productModel)obj;
			if(pmodel.getName().equals(name))
			{
				return pmodel;
			}
			
		}
		return null;
	}



	@Override
	public boolean isdeleteProduct(String name) {
		 Iterator<productModel> iterator = ProdList.iterator();
		    
		    while (iterator.hasNext()) {
		        productModel product = iterator.next();
		        if (product.getName().equalsIgnoreCase(name)) {
		            iterator.remove(); 
		            return true; 
		        }
		    }
		return false;
		
	}



	@Override
	public int getCountAllProduct() {
//		int count=0;
//		Iterator<productModel> i=ProdList.iterator();
//		while(i.hasNext())
//		{
//			productModel product = i.next();
//			count++;
//		}
		return ProdList.size() ;
	}

	
	
	

}
