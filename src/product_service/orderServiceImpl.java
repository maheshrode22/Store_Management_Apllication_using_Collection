package product_service;

import java.util.List;

import Product_model.orderModel;
import Product_model.productModel;
import Product_repo.orderRepoImpl;

public class orderServiceImpl implements orderServise{

	
	orderRepoImpl o=new orderRepoImpl();
	public boolean addProduct(orderModel pModel) {
		// TODO Auto-generated method stub
		return o.addProduct(pModel);
	}

	@Override
	public List getOrderProduct() {
		// TODO Auto-generated method stub
		return o.getOrderProduct();
	}


}
