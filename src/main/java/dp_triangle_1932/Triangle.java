package dp_triangle_1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {

	private static int maxSum= 0;
	
	/*
	private static int [][] dp= {{0,0,0,0,0,0},
		     	 				 {0,7,0,0,0,0},
		     	 				 {0,3,8,0,0,0},
		     	 				 {0,8,1,0,0,0},
		     	 				 {0,2,7,4,4,0},
		     	 				 {0,4,5,2,6,5}};
	*/
	
	private static int [][] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int row= Integer.parseInt(br.readLine());
		dp = new int[row+1][row+1];
		
		String readLine= "";
		String [] chars;
		
		for (int j= 1; j< row+1; j++) {
			readLine= br.readLine();
			chars= readLine.split(" ");
			
			for (int k= 1; k< j+1; k++) {
				dp[j][k]= Integer.parseInt(chars[k-1]);
			}
		}
		
		for (int i= 1; i< row+1; i++ ) {
			
			for (int j= 1; j<= i; j++ ) {
				
				if(i==1 && j==1) {
					// do nothing
					
				} else if(j==1) {
					dp[i][j]= dp[i][j] + dp[i-1][j];
					
				} else if(j==i) {
					dp[i][j]= dp[i][j] + dp[i-1][j-1];
					
				} else {
					dp[i][j]= Math.max(dp[i][j] + dp[i-1][j-1], dp[i][j]+dp[i-1][j]);
					
				}
				
				if(dp[i][j] > maxSum) {
					maxSum= dp[i][j]; 
				}
			}
		}
		
		System.out.println(maxSum);
	}
}