package sse;

import java.util.Scanner;

public class B6_2 {
	public static class B6_2_1{
		int score;
		int id;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int howMany = scan.nextInt();
		B6_2_1[] obj = new B6_2_1[howMany];
		for(int i=0; i<howMany; i++) {
			obj[i].score = scan.nextInt();
			obj[i].id = i;
		}
		scan.close();

		for(int i=0; i<howMany; i++) {
			for(int j=i+1; j<howMany;j++) {
				if(obj[i].score<obj[j].score) {
					B6_2_1 temp = new B6_2_1();
					temp = obj[i];
					obj[i] = obj[j];
					obj[j] = temp;
				}else if(obj[i].score == obj[j].score) {
					if(obj[i].id>obj[j].id) {
						B6_2_1 temp = new B6_2_1();
						temp = obj[i];
						obj[i] = obj[j];
						obj[j] = temp;
					}
				}
			}
		}
		for(int i=0; i<howMany; i++) {
			System.out.print(obj[i]+" ");
		}
		System.out.print(obj[0].id+" "+obj[1].id+" "+obj[2].id);

	}
}
