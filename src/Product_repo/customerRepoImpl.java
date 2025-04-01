package Product_repo;

import java.util.ArrayList;
import java.util.List;

import Product_model.customerModel;

public class customerRepoImpl implements customerRepo{

	public static  List customerList=new ArrayList();
	@Override
	public boolean isAddNewCustomer(customerModel cmodel) {
		// TODO Auto-generated method stub
		return customerList.add(cmodel);
	}

}
