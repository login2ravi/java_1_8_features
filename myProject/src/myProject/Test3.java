package myProject;

interface NumberChecker{
	boolean resolve(int a);
}

public class Test3 {

public static boolean checkNumber(NumberChecker numCheck,int number) {
		return numCheck.resolve(number);
}	

public NumberChecker isOddNumber() {
	return odd -> (odd %2) !=0;
	//return (if(odd&1) == 1);
}
	
	public static void main(String ar[]) {
		Test3 test3 = new Test3();
		NumberChecker numCheck = test3.isOddNumber();
		System.out.println(numCheck.resolve(5));
	}
	
}
