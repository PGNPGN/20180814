package sse;

import java.util.Scanner;

public class B7 {
	Scanner scan;
	int num;
	int[] array;
	int sum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B7 obj = new B7();
		obj.getInput();
//		obj.print();
		obj.firstSort();
//		obj.print();
		obj.getSum();
	}

	public void getInput() {
		scan = new Scanner(System.in);
		num = scan.nextInt();
		array = new int[num];
		
		for(int i=0; i<num; i++) {
			array[i] = scan.nextInt();
		}
	}

	public void firstSort() {
		for(int i=0; i<num; i++) {
			for(int j=i+1; j<num; j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public void print() {
		for(int i=0; i<num; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}
	
	public void getSum() {
		for(int i=0; i<num; i++) {
			sum += array[i]*(num-i);
		}
		sum -=array[0];
		System.out.println(sum);
	}
}
