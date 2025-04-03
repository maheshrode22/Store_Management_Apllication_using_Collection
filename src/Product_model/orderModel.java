package Product_model;

public class orderModel {

	
	
	private int oid;
	private int qty;
	private productModel pmodel;
	
	public orderModel(int oid, int qty, productModel pmodel) {
		
		this.oid = oid;
		this.qty = qty;
		this.pmodel = pmodel;
	}
	
	public productModel getPmodel() {
		return pmodel;
	}

	public void setPmodel(productModel pmodel) {
		this.pmodel = pmodel;
	}

	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
