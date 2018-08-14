package sse;

import java.util.Scanner;

public class A9 {

	Scanner scan = new Scanner(System.in);
	int a;
	int b;
	char[][] map;
	char[][] smallmap;
	String dummy = "";
	int sol = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A9 obj = new A9();
		obj.process();
	}

	public void process() {
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

		for(int i=0; i<=a-b; i++) {
			for(int j=0; j<=a-b; j++) {
				sol += check(i, j, b);
			}
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
}
