package generics;

public class GenericPrinter<T extends Material> {
	private T material; // 재료에 타입을 제너릭으로 둠

	
	public T getMaterial() {		return material;	}
	public void setMaterial(T material) {		this.material = material;	}
	
	@Override
	public String toString() {
		//return "GenericPrinter [material=" + material + "]";
		return material.toString(); //재료 클래스의 toString() 호출
	}
	public void printing() {
		material.doPrinting();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
