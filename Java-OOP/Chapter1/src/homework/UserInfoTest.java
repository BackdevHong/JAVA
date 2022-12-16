package homework;

public class UserInfoTest {
	public static void main(String[] args) {
		UserInfo Tomas = new UserInfo();
		Tomas.userAge = 37;
		Tomas.userName = "Tomas";
		Tomas.userHeight = 180;
		Tomas.userLb = 78;
		Tomas.userSex = "남";

		System.out.println(Tomas.getUserInfo());
	}
}
