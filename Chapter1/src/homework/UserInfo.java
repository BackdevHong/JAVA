package homework;

public class UserInfo {
	public int userHeight;
	public int userLb;
	public String userSex;
	public String userName;
	public int userAge;
	
	String getUserInfo(){
		return userName + "님의 정보를 확인합니다. 몸무개: " + userLb + "Kg 키: " + userHeight + "cm 성별: " + userSex + " 나이: " + userAge;
	}
}
