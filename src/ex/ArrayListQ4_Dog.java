package ex;


public class ArrayListQ4_Dog {
	private String name;
	private String type;
	
	
	public ArrayListQ4_Dog(String name,String tpye) {
		this.name=name;
		this.type=tpye;
		
	}
	
	
	public ArrayListQ4_Dog() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String showDogInfo() {
		return name +"," + type;
	}
	
}
