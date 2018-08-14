package sse;

import java.util.Scanner;

public class B6 {
	public int[] score;
	public int[] id;
	public int howMany = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B6 obj = new B6();
		obj.getInput();
		obj.sort();
	}

	public void getInput() {
		Scanner scan = new Scanner(System.in);
		howMany = scan.nextInt();
		score = new int[howMany];
		id = new int[howMany];
		for(int i=0; i<howMany; i++) {
			score[i] = scan.nextInt();
			id[i] = i+1;
		}
		scan.close();
	}
	public void sort() {
		for(int i=0; i<3; i++) {
			for(int j=i+1; j<howMany;j++) {
				if(score[i]<score[j]) {
					int temp =score[i]; score[i] =score[j]; score[j] = temp;
					temp = id[i]; id[i] = id[j]; id[j] = temp;
				}else if(score[i] == score[j]) {
					if(id[i]>id[j]) {
						int temp =score[i]; score[i] =score[j]; score[j] = temp;
						temp = id[i]; id[i] = id[j]; id[j] = temp;
					}
				}
			}
		}
		System.out.print(id[0]+" "+id[1]+" "+id[2]);
	}
}
