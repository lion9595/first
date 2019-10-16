package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new Computer() {
			
			@Override
			public void typing() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}
		};
		Computer c2 = new DeskTop();
		Computer c3 = new NoteBook() {
			
			@Override
			public void typing() {
				// TODO Auto-generated method stub
				
			}
		};
		Computer c4 = new MyNoteBook();
		
		
		
		
	}

}
