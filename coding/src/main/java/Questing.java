/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d)  {
		int i = (int) d;
		
		return i/2;
	}

	static boolean quest2(String s) {
		String s1 = "({}[])";
		
		if(s1.equals(s)) {
			return true;
		}	
		
		return false;
	}
}
