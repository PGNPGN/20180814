package sse;

import java.util.Scanner;

public class B4 {
	public int a = 0;
	public char[][] map;
	public int[] direction = new int[4];
	public int[] dx = {1, 0, -1, 0};
	public int[] dy = {0, -1, 0, 1};
	public int x=0, y=0;
	public int cnt = 0;
	public int index = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B4 obj = new B4();
		obj.process();
		obj.explore();
	}
	public void process() {
		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.nextLine());
		map = new char[a][a];
		String dummy = "";
		
		for(int i=0; i<a; i++) {
			dummy = scan.nextLine();
			for(int j=0; j<a; j++) {
				map[i][j] = dummy.charAt(j);
			}
		}
		
		for(int i=0; i<4; i++) {
			direction[i] = scan.nextInt();
		}
		
		scan.close();
	}
	
	public void explore() {
			while(true) {
				index = index % 4;
				try {
					if(map[x+dx[direction[index]-1]][y+dy[direction[index]-1]]=='0') {
						map[x][y] = '2';
						cnt++;
						x=x+dx[direction[index]-1]; y=y+dy[direction[index]-1];
						System.out.println(x+" "+y);
					}else if(map[x+dx[direction[index]-1]][y+dy[direction[index]-1]]=='2') {
						System.out.println("meet 2");
						break;
					}else if(map[x+dx[direction[index]-1]][y+dy[direction[index]-1]]=='1') {
						index++;
						System.out.println("index =" + index);
					}
						
				}catch(ArrayIndexOutOfBoundsException e) {
					index++;
				}		
			}
			
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}

		System.out.println(cnt);
	}
	
}
