package Product_repo;
import java.util.*;

import Product_model.productModel;

public interface productRepository {


	boolean isaddProduct(productModel product);
	List getProduct();
	
	
}
