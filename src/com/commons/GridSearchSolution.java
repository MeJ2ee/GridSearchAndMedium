package com.commons;

import java.io.File;
import java.util.Scanner;

public class GridSearchSolution {

	public static boolean isMatch(String[] grid, int r, int c, String[] pattern) {
		for(int i = r; i < r + pattern.length; i++) {
			if(!grid[i].substring(c, c + pattern[0].length()).equals(pattern[i - r]))
				return false;
		}
		return true;
	}

	public static void main(String[] args)  {
		try {
			/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your clas should be named Solution. */
			Scanner sc = new Scanner(new File("/home/meena/eclipse-workspace/Legate_v2_Anupam/Testing/src/com/commons/grid-search input1 test.txt"));
			int T = sc.nextInt();
			for(int k = 0; k < T; k++){
				int R = sc.nextInt();
				int C = sc.nextInt();
				String[] grid = new String[R];
				for(int i = 0; i < R; i++){
					grid[i] = sc.next();
				}
				int r = sc.nextInt();
				int c = sc.nextInt();
				String[] pattern = new String[r];
				for(int i = 0; i < r; i++) {
					pattern[i] = sc.next();
				}
				boolean ret = false;
				for(int i = 0; i <= R - r; i++){
					for(int j = 0; j <= C - c; j++){
						if(grid[i].charAt(j) == pattern[0].charAt(0)){
							ret = isMatch(grid, i, j, pattern);
							if(ret)
								break;
						}
					}
					if(ret)
						break;
				}
				if(ret){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}

	}
}