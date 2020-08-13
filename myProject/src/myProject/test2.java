package myProject;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = {"Sureshkumar","Ramesh","Raj"};
		Arrays.sort(array,(str1, str2) -> {
			//return (str1.length() -str2.length());
			return str1.length() - str2.length();
		} );
		Arrays.stream(array).forEach(str -> System.out.println(str));
	}

}
