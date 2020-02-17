
public class Product {

	static int count = 0;
	int serialNo;
	static{
		count = 200;
	}
	{
		++count;
		serialNo = count;	
	}
	
	public Product(){};
}
