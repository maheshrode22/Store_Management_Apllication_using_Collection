package product_service;

import java.util.*;

import Product_model.productModel;

public interface productService {
	
	

	boolean isAddNewProduct(productModel model);
	public List getAllProduct();
	public productModel getProductByName(String name);
	boolean isdeleteProduct(String name);
	public int getCountAllProduct();
	

	

	
	
}
