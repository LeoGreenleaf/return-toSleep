/** The mazeSolver class takes a maze and using recursion returns the boolean value of the statement
    “the maze is navigable, having a legal travel path that is continuous from start point to existing treasure”. **/

public class MazeSolver {

    private Maze inProgress;

    public MazeSolver(Maze maze) {
	inProgress = new Maze(maze);
    }

    public boolean mazeSolution(Maze testMaze) {

	if (inProgress.explorerIsOnA() == inProgress.TREASURE) {
	    return true;
	}
	if (inProgress.explorerIsOnA() == inProgress.WALL) {
	    return false;
	}
	return false;
    }
}



    
