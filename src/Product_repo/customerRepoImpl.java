package Product_repo;

import java.util.ArrayList;
import java.util.List;

import Product_model.customerModel;

public class customerRepoImpl implements customerRepo{

	public static  List customerList=new ArrayList();
	@Override
	public boolean isAddNewCustomer(customerModel cmodel) {
		
		return customerList.add(cmodel);
	}
	@Override
	public List getAllCustomer() {
		// TODO Auto-generated method stub
		return customerList;
	}

}
