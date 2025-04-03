package Product_model;

import java.util.List;

public class customerModel {

	 private int cid;
	 private String cname;
	 private long phone;
	 private List<orderModel> oModel;
	 
	 public customerModel()
	 {
		 
	 }
	public List<orderModel> getoModel() {
		return oModel;
	}
	public void setoModel(List<orderModel> oModel) {
		this.oModel = oModel;
	}
	public customerModel(int cid, String cname, long phone) {

		this.cid = cid;
		this.cname = cname;
		this.phone = phone;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	 
	 
}
