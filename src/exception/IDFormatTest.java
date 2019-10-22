package exception;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID)throws IDFormatExcetion{
		if(userID == null) {
			throw new IDFormatExcetion("아이디는 null 일수 없습니다.");
		}
		else if(userID.length()<8 || userID.length() > 20) {
			throw new IDFormatExcetion("8자 ~ 20자 로 입력하세요 ");
		}
		this.userID=userID;
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatExcetion e) {
			System.out.println(e.getMessage());
		}
		
		userID = "123456789";
		try {
			test.setUserID(userID);
		} catch (IDFormatExcetion e) {
			System.out.println(e.getMessage());
		}
	}

}
