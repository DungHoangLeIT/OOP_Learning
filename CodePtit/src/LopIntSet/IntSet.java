package LopIntSet;

import java.util.*;

public class IntSet {
	private int[] a;

	public IntSet(int[] a) {
		super();
		this.a = a;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}
	
	public IntSet union(IntSet b) {
		int[] c = new int[this.a.length + b.getA().length];
		int index = 0;
		for(int i = 0; i < a.length; i++) {
			c[index++] = a[i];
		}
		for(int i = 0; i < b.getA().length; i++) {
			c[index++] = b.getA()[i];
		}
		Set<Integer> s = new TreeSet<Integer>();
		for(int i : c) s.add(i);
		int[] d = new int[s.size()];
		int tmp = 0;
		for(int i : s) {
			d[tmp++] = i;
		}
		return new IntSet(d);
	}
	@Override
	public String toString() {
		String res = "";
		for(int i = 0; i < this.a.length; i++) {
			res = res + String.valueOf(a[i]) + " ";
		}
		return res;
	}
}
