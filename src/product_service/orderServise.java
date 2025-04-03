package product_service;

import java.util.List;

import Product_model.orderModel;
import Product_model.productModel;

public interface orderServise {

	boolean addProduct(orderModel pModel);
	List getOrderProduct();
}
