package product_service;

import java.util.*;
import java.util.List;

import Product_model.productModel;
import Product_repo.productRepositoryImpl;

public class productServiceImpl implements productService {
	productRepositoryImpl productRepo = new productRepositoryImpl();

	
	
	@Override
	public boolean isAddNewProduct(productModel model) {
		
		
		return productRepo.isaddProduct(model);
		
	
	}

	

	@Override
	public List getProducts() {
		// TODO Auto-generated method stub
		return productRepo.getProduct();
	}
	



}
