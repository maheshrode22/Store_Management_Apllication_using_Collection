package product_service;

import java.util.*;
import java.util.List;

import Product_model.productModel;

public class productServiceImpl implements productService {
	productModel product;
	
	@Override
	public boolean isAddNewProduct(productModel model) {
		List al=new ArrayList();
		al.add(model);
		return true;
		
	
	}

	@Override
	public List getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	



}
