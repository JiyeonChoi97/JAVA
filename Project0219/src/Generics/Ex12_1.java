package Generics;

import java.util.ArrayList;
import java.util.List;

class Product{}
class Tv extends Product{}
class Audio extends Product{}

public class Ex12_1 {

	public static void main(String[] args) {
		ArrayList<Product> 	productList = new ArrayList<Product>();
		ArrayList<Tv>		tvList 		= new ArrayList<Tv>();
//		ArrayList<Product>	tvList1 	= new ArrayList<Tv>();
//		List<Tv>			tvList2 	= new ArrayList<Tv>();
		
		productList.add(new Tv());
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
//		tvList.add(new Audio());
		
		printAll(productList);
	}

	public static void printAll(ArrayList<Product> list) {
		for(Product p:list)
			System.out.println(p);
		// TODO Auto-generated method stub
		
	}
	
	
}
