package vidu;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "le hoang dung , dep trai";
		String[] a = s.split(" , ");
		System.out.println(Arrays.toString(a));
	}
}
