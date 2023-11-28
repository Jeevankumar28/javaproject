package pojo;

public class CustomerDetails {
	private String code;
	private String name;
	private String phoneno;
	private String Address;
	public ItemDetails getItemobj() {
		return itemobj;
	}
	public void setItemobj(ItemDetails itemobj) {
		this.itemobj = itemobj;
	}
	private ItemDetails itemobj;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	

}
