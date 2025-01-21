package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import basics.override;

class Product1 {
	private int productId;
	private String productName;
	
	public Product1(int productId, String ProductName) {
		this.productId=productId;
		this.productName=productName;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId=productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
}

public class Product {

	public static void main(String[] args) {
		List<Product1> products=new ArrayList<>();
		products.add(new Product1(1,"cpu"));
		products.add(new Product1(2,"mouse"));
		products.add(new Product1(3,"monitor"));
		products.add(new Product1(4,"keyboard"));
		
		//sorting the arraylist of products
		Collections.sort(products, Comparator.comparing(Product1::getProductName));
		
		for(Product1 product: products) {
			System.out.println(product);
		}

	}

}
