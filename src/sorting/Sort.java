package sorting;

public interface Sort {
	void ascedning(int[] arr);
	void descending(int[] arr);
	
	default void description() {
		System.out.println(" asceding() : 오름차순  / descding() : 내림차순 ");
	}
}
