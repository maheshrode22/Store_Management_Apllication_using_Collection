package product_service;

import java.util.*;
import java.util.List;

import Product_model.productModel;
import Product_repo.productRepositoryImpl;

public class productServiceImpl implements productService {
	
	productRepositoryImpl productRepo = new productRepositoryImpl();
	

	
	
	@Override
	public boolean isAddNewProduct(productModel model) {
		if(model.getStock()>0)
		{
			return productRepo.isaddProduct(model);
		}else {
			return false;
			
		}
		
	
	}


	@Override
	public List getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.getAllProduct();
	}



	@Override
	public productModel getProductByName(String name) {
	
		return productRepo.getProductByName(name);
	}


	@Override
	public boolean isdeleteProduct(String name) {
		
		return productRepo.isdeleteProduct(name);


	}


	@Override
	public int getCountAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.getCountAllProduct();
	}


	
	



}
