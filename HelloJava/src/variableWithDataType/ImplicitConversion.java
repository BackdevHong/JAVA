package variableWithDataType;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		// 덜 정밀한 수(int)에서 더 정밀한 수(float)로 변한할 시 아무런 문제가 되지 않는다.
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		
		System.out.println(dNum);
	}

}
