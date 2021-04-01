
public class ShoppingDemo {

	public static void main(String[] args) 
	{
		Shopping sh1 = new Shopping();
		System.out.println(sh1.toString());
		Shopping sh2 = new Shopping("Potatoes", 3.49, 2, 15);
		System.out.println(sh2.toString());
		Shopping sh3 = new Shopping(sh2);
		System.out.println(sh3.toString());
		System.out.println("Total Cost of 3 laptops: $" + sh2.totalPrice());
		System.out.println("Total Cost of 3 laptops: $" + sh2.totalPrice(800));
		
		
		

	}

}
