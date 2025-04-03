package Product_repo;

import java.util.List;

import Product_model.orderModel;
import Product_model.productModel;

public interface orderRepo {

	boolean addProduct(orderModel pModel);
	List getOrderProduct();
}
