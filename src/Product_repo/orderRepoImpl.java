package Product_repo;

import java.util.*;

import Product_model.orderModel;
import Product_model.productModel;

public class orderRepoImpl implements orderRepo{

	List order=new ArrayList();
	public boolean addProduct(orderModel pModel) {
		// TODO Auto-generated method stub
		return order.add(pModel);
	}
	@Override
	public List getOrderProduct() {
		// TODO Auto-generated method stub
		return order;
	}

}
