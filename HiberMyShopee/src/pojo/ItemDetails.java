package pojo;

public class ItemDetails {
	private String itemcode;
	private String itemname;
	private double itemprice;
	private int qoh;
	public CustomerDetails getCustobj() {
		return custobj;
	}
	public void setCustobj(CustomerDetails custobj) {
		this.custobj = custobj;
	}
	private CustomerDetails custobj;
	
	
	public String getItemcode() {
		return itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getItemprice() {
		return itemprice;
	}
	public void setItemprice(double itemprice) {
		this.itemprice = itemprice;
	}
	public int getQoh() {
		return qoh;
	}
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}

}
