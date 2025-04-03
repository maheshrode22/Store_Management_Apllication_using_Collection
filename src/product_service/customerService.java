package product_service;

import java.util.List;

import Product_model.customerModel;

public interface customerService {
	boolean isAddNewCustomer(customerModel model);
	List getAllCustomer();
}
