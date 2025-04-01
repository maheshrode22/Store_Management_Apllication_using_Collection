package Product_model;

public class customerModel {
private int cid;
private String cname;
private int cphon;


public customerModel(int cid, String cname, int cphon) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cphon = cphon;
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
public int getCphon() {
	return cphon;
}
public void setCphon(int cphon) {
	this.cphon = cphon;
}


}
