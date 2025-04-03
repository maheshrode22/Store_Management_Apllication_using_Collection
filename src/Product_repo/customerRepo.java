package Product_repo;

import Product_model.customerModel;
import java.util.*;
public interface customerRepo {
	boolean isAddNewCustomer(customerModel cmodel);
	List getAllCustomer();

}
