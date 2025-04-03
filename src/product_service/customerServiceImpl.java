package product_service;

import java.util.List;

import Product_model.customerModel;
import Product_repo.customerRepo;
import Product_repo.customerRepoImpl;

public class customerServiceImpl implements customerService {
	customerRepo cRepo= new customerRepoImpl();
	
	@Override
	public boolean isAddNewCustomer(customerModel model) {
		// TODO Auto-generated method stub
		return cRepo.isAddNewCustomer(model);
	}
	
	public List getAllCustomer() {
		// TODO Auto-generated method stub
		return cRepo.getAllCustomer();
	}

}
