/**
 * 
 */
package com.hackerank.algorithms;

import java.util.Scanner;

/**
 * @author Mayank
 *
 */
public class Java1DArray {

	public static boolean canWin(int leap, int[] game) {
		// Return true if you can win the game; otherwise, return false.
		boolean result = Boolean.TRUE;
		for(int i = 0; i < game.length; i++) {
			if(i+leap > game.length)
				break;
			else if(i+leap <= game.length && game[(i+leap) - 1] == 0)
				i = i + leap;
			else if(game[i+1] == 0) 
				continue;
			else if (game[i-1] == 0) 
				i -= 2;
			else if((i+leap < game.length) && game[i+1] != 0 && game[i-1] != 0) {
				result = Boolean.FALSE;
				break;
			}  
			
		}

		return result;
	}

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
		} 
		scan.close(); */
		
		int leap = 1;
		int[] game = {0,1,0};
		System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	}
}
