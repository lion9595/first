package stream.chapter13;
import java.util.List;
import java.util.ArrayList;

class Book{
	String name;
	int price;
	
	public Book(String name,int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}

	public int getPrice() {		return price;	}
	public void setPrice(int price) {		this.price = price;	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
}


public class LibraryTest_Q7 {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("ÀÚ¹Ù",25000));
		

	}

}
