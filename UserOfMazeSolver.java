/** Does what you think **/ 
public class UserOfMazeSolver{
	public static void main(String[] commandLine) throws java.io.FileNotFoundException {
        	Maze testMaze = new Maze(commandLine[0], Integer.parseInt(commandLine[1]), Integer.parseInt(commandLine[2]));
	       	MazeSolver testMazeSolver = new MazeSolver();
		System.out.println(testMaze);
    		System.out.println(testMazeSolver.solve(testMaze));
	}
}
