package com.test;

public class Test {

	public static void bubble() {
		int[] a = {8,6,7,2,3};
		
		/**
		 * a.length-1:因为a[j+1]会越界
		 * -i:因为第一次i==0,不用管，但是第一次之后最大的数已经在末尾了，
		 * 所以当i==1时，也就是第二次，就不用比最后下标的数了
		 * 
		 */
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j+1];
					a[j+1] = a[j];
					a[j] = t;
				}
			}
		}
		
		for(int q=0;q<a.length;q++) {
			System.out.println(a[q]);
		}
	}
	
	public static void main(String[] args) {
		bubble();
	}
	
}
