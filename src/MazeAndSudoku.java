
public class MazeAndSudoku {
	
	// Helper function to set create a 2D array of chars
	// from an array of strings representing each row
	// Note: Each string must be the same length.
	public static char[][] makeArray(String[] rows) {
		int numRows = rows.length;
		int numCols = rows[0].length();
		char[][] arr = new char[numRows][numCols];
		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numCols; c++) {
				arr[r][c] = rows[r].charAt(c);
			}
		}
		return arr;
	}
	

	//============ MAZE SECTION ===================

	public static void displayGrid(char[][] grid) {
		// This methods assumes the grid is rectangular -- that is,
		// that it consists of Strings representing the grid's rows,
		// and that each row has the same number of characters in it.
		final String margin = "    ";
		int h = grid.length;
		int w = grid[0].length;
		for (int r = 0; r < h; r++) {
			System.out.print(margin);
			for (int c = 0; c < w; c++) {
				System.out.print(grid[r][c]);
			}
			System.out.println();
		}
	}

	
	// Do NOT change this method
	public static void solveMaze(char[][] maze) {
		System.out.println("Before solving:");
		displayGrid(maze);
		System.out.println("");
		boolean result = findPath(maze, 1, 1);
		if (result) {
			System.out.println("Solved:");
			displayGrid(maze);
		} else {
			System.out.println("No solution.");
		}
    }
	
	// recursive helper for solveMaze
	private static boolean findPath(char[][] maze, int r, int c) {
		// base case: already at solution
		if (maze[r][c] == 'G')
			return true;
		
		// for every choice C:
		//   make choice C
		//   recursively check: is it now solvable?
		//      if true: return true
		//   unmake choice C
		
		
		// final step
		return false;
	}

	
	//============ SUDOKU SECTION ===================

	public static void displaySudoku(char[][] grid)
	{
		// This method assumes that grid is 4x4 -- that is,
		// that it contains 4 strings each of length 4;

		final String bar = " -- -- ";
		final String margin = "    ";
		for (int r = 0; r < 4; r++)
		{
			if ((r%2) == 0)
				System.out.print(margin + bar + "\n");
			System.out.print(margin);
			for (int c = 0; c < 4; c++)
			{
				if (c%2 == 0)
					System.out.print("|");
				System.out.print(grid[r][c]);
			}
			System.out.print("|\n");
		}
		System.out.print(margin + bar + "\n");
	}

	static public void main(String[] args) {
		String[] maze = { 
				"#####",
				"# # #",
				"#   #",
				"# # #",
				"#G# #",
				"#####"
		};
		
		displayGrid(makeArray(maze));
		
		
		String[] mysudoku = {
				"A...",
				".B..",
				"...C",
				"...."
		};
		displaySudoku(makeArray(mysudoku));
	}
}
