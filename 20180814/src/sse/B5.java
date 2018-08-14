package sse;

import java.util.Scanner;

public class B5 {
	int howMany;
	int[] array;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B5 obj = new B5();
		obj.getInput();
		obj.sorting();
	}
	public void getInput() {
		Scanner scan = new Scanner(System.in);

		howMany = scan.nextInt();
		array = new int[howMany];

		for(int i=0; i<howMany; i++) {
			array[i] = scan.nextInt();
		}

		scan.close();
	}
	
	public void sorting() {
		for(int i=0; i<howMany; i++) {
			for(int j=0; j<i; j++) {
				if(array[j]>array[i]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		for(int i=0; i<howMany; i++)
		System.out.print(array[i]+" ");
	}
}
