package Product_repo;
import java.util.*;

import Product_model.productModel;

public interface productRepository {


	boolean isaddProduct(productModel product);
	
	public List getAllProduct();
	public productModel getProductByName(String name);
	boolean isdeleteProduct(String name);
	
	public int getCountAllProduct();	
	
}
