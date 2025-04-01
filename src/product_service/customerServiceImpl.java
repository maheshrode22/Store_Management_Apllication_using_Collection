package product_service;

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

}
