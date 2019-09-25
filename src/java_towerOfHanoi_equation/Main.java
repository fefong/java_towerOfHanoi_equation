package java_towerOfHanoi_equation;

import java.util.Scanner;

public class Main {
	
	public static int equationTowerHanoi(int numberDisks) {
		return (int) (Math.pow(2, numberDisks)-1);	
	}
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.print("Enter number of disks: ");
		int n = in.nextInt();
		
		System.out.println("Minimal number of moves required to solve is: "+equationTowerHanoi(n));
	}
	
}
