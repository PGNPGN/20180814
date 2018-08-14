package sse;

import java.util.Scanner;

public class B0 {
	Scanner scan;
	int a;
	int[][] map;
	int[] dx = {-1, 0, 0, 1};
	int[] dy = {0, 1, -1, 0};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B0 obj = new B0();
		obj.process();
	}
	public void process() {
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		map = new int[a][a];
		int sol =0 ;
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				sol += check(i,j);
			}
		}
		
		System.out.println(sol);
		scan.close();
	}
	
	public int check(int a, int b) {
		for(int k=0;;k++) {
			for(int i=0; i<4; i++) {
				try {
					if(map[a+dx[i]*k][b+dy[i]*k]==0) return k;
				}catch(ArrayIndexOutOfBoundsException e) {
					return k;
				}
			}
		}
	}
}
