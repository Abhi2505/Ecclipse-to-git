package packA;

public class Product {
private int prodid;
private String prodname;
private int price;

public Product(int prodid, String prodname,int price) {
	this.prodid = prodid;
	this.prodname = prodname;
	this.price=price;
}

@Override
public String toString() {
	return "Product [prodid=" + prodid + ", prodname=" + prodname + ", price=" + price + "]";
}

}
