package generics;

public class GenericPrinter<T extends Material> {
	private T material; // ��ῡ Ÿ���� ���ʸ����� ��

	
	public T getMaterial() {		return material;	}
	public void setMaterial(T material) {		this.material = material;	}
	
	@Override
	public String toString() {
		//return "GenericPrinter [material=" + material + "]";
		return material.toString(); //��� Ŭ������ toString() ȣ��
	}
	public void printing() {
		material.doPrinting();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
