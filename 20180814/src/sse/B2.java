package sse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B2 {
	int a;
	int b;
	char[][] map;
	char[][] smallmap;
	String dummy = "";
	int sol = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 obj = new B2();
		obj.process();
	}

	public void process() {
		Scanner scan = null;
		try {
			scan = new Scanner(new File("input"));
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		a = Integer.parseInt(scan.nextLine());
		map = new char[a][a];
		for(int i=0; i<a; i++) {
			dummy = scan.nextLine();
			for(int j=0; j<a; j++) {
				map[i][j] = dummy.charAt(j);
			}
		}
		b = Integer.parseInt(scan.nextLine());
		smallmap = new char[b][b];
		for(int i=0; i<b; i++) {
			dummy = scan.nextLine();
			for(int j=0; j<b; j++) {
				smallmap[i][j] = dummy.charAt(j);
			}
		}
		for(int k=0; k<4; k++) {
			for(int i=0; i<=a-b; i++) {
				for(int j=0; j<=a-b; j++) {
					sol += check(i, j, b);
				}
			}
			rotation(b);
		}
		

		System.out.println(sol);
	}

	public int check(int x, int y, int b) {
		for(int i=0; i<b; i++) {
			for(int j=0; j<b; j++) {
				if(	map[x+i][y+j] != smallmap[i][j]) {
					return 0;
				}
			}
		}
		return 1;
	}
	
	public void rotation(int b) {
		char[][] dummy = new char[b][b];
		
		for(int i=0; i<b; i++) {
			for(int j=0; j<b; j++) {
				 dummy[j][b-1-i] = smallmap[i][j]; //c´Â dummyarray, b´Â array
			}
		}
		
		smallmap = dummy;
//		for(int i=0; i<b; i++) {
//			for(int j=0; j<b; j++) {
//				 second[i][j] = seconddummy[i][j];
//			}
//		}	
	}
}
