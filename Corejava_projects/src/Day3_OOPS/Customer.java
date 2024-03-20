//Program to demonstrate the customer entity class
package Day3_OOPS;

public class Customer 
{
	private int cid ;
	private String name;
	private String address;
	//default constructor
	public Customer()
	{
		this.cid=01;
		this.name="roja";
		this.address="Sulurpettai";
	}
	
	//Parameterized constructor
	public Customer(int cid,String naem, String address)
	{
		this.cid=cid;
		this.name=name;
		this.address=address;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", address=" + address + "]";
	}
	
	//Getter and Setter
	
}