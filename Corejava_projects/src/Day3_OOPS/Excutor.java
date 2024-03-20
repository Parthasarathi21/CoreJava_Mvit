package Day3_OOPS;

public class Excutor {
	public static void main (String[] args) {
		Customer c1 = new Customer();
		c1.setCid(112);
		c1.setName("Roja");
		c1.setAddress("Puducherry");
		System.out.println("Customer id:"+c1.getCid()+" | Customer name: "+c1.getName()+" | Customer Address: "+c1.getAddress());
	
		Customer c2 = new Customer();
		c2.setCid(113);
		c2.setAddress("Priya");
		c2.setAddress("Banglore");
		
		System.out.println(c2);		//calling the tostrin method
		
		Customer c3 = new Customer(); //invoke Explict default constructor
		System.out.println(c3);
		
		Customer c4=new Customer(114, "dhanu","yanam");//invoke parameterized constructor
		System.out.println(c4);
	}
}