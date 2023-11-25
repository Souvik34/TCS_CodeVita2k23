import java.util.*;

public class maze {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    
        int rows = in.nextInt();
        int cols = in.nextInt();

        
        int[][] maze = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maze[i][j] = in.nextInt();
            }
        }

        
        int startrow = in.nextInt();
        int startcol = in.nextInt();
        int targetrow = in.nextInt();
        int targetcol = in.nextInt();


        boolean[][] visited = new boolean[rows][cols];

        
        int shortestPath = findShortestPath(maze, visited, startrow, startcol, targetrow, targetcol);

        
        if (shortestPath != -1) {
            System.out.print(shortestPath);
        } else {
            System.out.print("STUCK");
        }

    }

    private static int findShortestPath(int[][] maze, boolean[][] visited, int currentRow, int currentCol, int targetRow, int targetCol) {
        
        if (currentRow < 0 || currentRow >= maze.length || currentCol < 0 || currentCol >= maze[0].length || visited[currentRow][currentCol]) {
            return -1;
        }

        
        if (currentRow == targetRow && currentCol == targetCol) {
            return 0;
        }

        
        if (maze[currentRow][currentCol] == 1 || visited[currentRow][currentCol]) {
            return -1;
        }

        
        visited[currentRow][currentCol] = true;

        
        int[] rowOffsets = {-1, 1, 0, 0};
        int[] colOffsets = {0, 0, -1, 1};
        int minDistance = -1;

        for (int i = 0; i < 4; i++) {
            int newRow = currentRow + rowOffsets[i];
            int newCol = currentCol + colOffsets[i];

            int result = findShortestPath(maze, visited, newRow, newCol, targetRow, targetCol);
            if (result != -1) {
    
                if (maze[currentRow][currentCol] == 3) {
                    return result + 1;
                } else {
                    if (minDistance == -1 || result + 1 < minDistance) {
                        minDistance = result + 1;
                    }
                }
            }
        }

        return minDistance;
    }
}