package day4;

//public class Product implements Comparable<Product>{
	public class Product {
private int prodid;
private String name;
private int price;
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Product(int prodid, String name, int price) {
	super();
	this.prodid = prodid;
	this.name = name;
	this.price = price;
}
@Override
public String toString() {
	return "Product [prodid=" + prodid + ", name=" + name + ", price=" + price + "]";
}
//@Override
//public int compareTo(Product o) {
//	// TODO Auto-generated method stub
//	//descending below
//	System.out.println(o.prodid-this.prodid);
//	//return this.prodid-o.prodid;
//	//return o.prodid-this.prodid;
////ascending above;	
//	return this.name.compareTo(o.name);
//	//above in ascending order of name
//}
}
