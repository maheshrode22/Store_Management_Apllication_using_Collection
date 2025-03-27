package Product_repo;
import java.util.*;

import Product_model.productModel;

public  class productRepositoryImpl implements productRepository {
	public static  List al=new ArrayList();
	
	@Override
	public  boolean isaddProduct(productModel product) {
		
		
		return al.add(product);
	}

	
	public List getProduct() {
		
		
		return al;
	}
	

}
