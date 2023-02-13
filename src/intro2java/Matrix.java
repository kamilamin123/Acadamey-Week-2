package intro2java;
import java.util.Arrays;
import java.util.Scanner;


public class Matrix {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String[][] arr = {
				{ "a", "v", "a", "o", "n", "+" }, 
				{ "t", "o", "i", "-", "l", "l" },
				{ "m", "a", "i", "-", "i", "i" }, 
				{ "s", "s", "-", "-", "a", "a" }, 
				{ "o", "e", "a", "-", "a", "i" },
				{ "o", "e", "n", "-", "o", "i" },
				{ "s", "t", "a", "-", "i", "i" } };
		
		for (int row1 = arr.length-1; row1 <=0 ; row1--) {
			if (arr[2][3].equals("-")) {
				System.out.println("133");
				
			}}
		
		

		
		
		for (int j = 0; j <= arr.length + arr[0].length - 1; j++) {
			String previousValue="";
			int numberCheck=0;
			for (int k = j; k >= 0; k--) { // cols
				int l = j - k; //  rows
				int mirror = arr.length - l;
				if (mirror >= 0 && mirror < arr.length && k < arr[0].length) {
					System.out.print(arr[mirror][k] + " ");
					if (arr[mirror][k].equals(previousValue)) { 

						numberCheck++;
						if (numberCheck==3) {
							System.out.println("winner");
							break;
						}
					}else {
						numberCheck=0;
						previousValue=arr[mirror][k];
					}
				}
			}
			System.out.println();
		}
		for( int k = 0 ; k < arr.length + arr[0].length ; k++ ) {
			String previousValue="";
			int numberCheck=0;
			for( int j = 0 ; j <= k ; j++ ) {
				int i = k - j;
				if( i < arr.length && j < arr[0].length ) {
					System.out.print(arr[i][j]+ " ");
					if (arr[i][j].equals(previousValue)) { 
						numberCheck++;
						if (numberCheck==3) {
							System.out.println("winner");
						}
					}else {
						numberCheck=0;
						previousValue=arr[i][j];
					}
				}
			}
			System.out.println();
		}

		for (int col = 0; col < arr[0].length; col++) {
			String previousValue="";
			int numberCheck=0;
			for (int row = arr.length-1; row >=0 ; row--) {
				if (arr[row][col].equals("-")) {
					break;
				}
				if (arr[row][col].equals(previousValue)) { 
					numberCheck++;
					if (numberCheck==3) {
						System.out.println("winner");
						break;
					}
				}else {
					numberCheck=0;
					previousValue=arr[row][col];
				}
			}
		}

		for (int row=0 ; row <= arr.length-1 ; row++) {
			String previousvaule="";
			int numberCheck=0;
			for (int col = 0; col < arr[0].length; col++) {
				if (arr[row][col].equals(previousvaule)) { 
					numberCheck++;
					if (numberCheck==3) {
						System.out.println("winner");
					}
				} else {
					numberCheck=0;
					previousvaule=arr[row][col];
				}
			}

		}
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		String[] player ;
		int n;
		while(true) {
			System.out.print("enter the number of players at least 2: ");

			n = scan.nextInt();
			if (n<2) {
				continue;
			}else {
				break;
			}
		}

		player=new String[n];
		scan.nextLine();
		String name="";
		Boolean check= false;
		int i=0;
		while( i<n) {
			System.out.print("enter the player name it should be unique: ");
			name = scan.nextLine();

			for(Object each:player) {
				if (name.equals(each)) {
					check=true;
					continue;
				}
			}


			if (!check) {
				player[i]=name;
				i++;
			}
			check=false;

		}
		System.out.println(Arrays.toString(player));
		scan.close();
	}


}
