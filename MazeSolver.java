/** Returns the boolean value of the statement:
    The maze is navigable, having a legal travel path that is continuous from start point to existing treasure. **/
public class MazeSolver {
    //Copied fields from Maze.java for ease of coding and ease of understanding what is going on
    public final static int TREASURE = 0;
    public final static int WALL = 1;
    public final static int STEPPING_STONE = 2;
    public final static int[] DIRECTIONS = {Maze.EAST, Maze.NORTH, Maze.SOUTH, Maze.WEST};


    //The real meat of the code
    public boolean solve(Maze mazeToBeSolved) {
    	//Base case for beginning outside of the map
	if(mazeToBeSolved.explorerPosition == null) return false;
	//Base case for explorer being on a treasure
	if (mazeToBeSolved.explorerIsOnA() == TREASURE) return true;
	//Recursive case for moving in each direction
	else if (mazeToBeSolved.explorerIsOnA() == STEPPING_STONE) {
		//Create a snapshot to signify a successful/safe maze state
		Maze snapshot = new Maze(mazeToBeSolved);
		//Move and check each direction in the order East, North, West, South
		for(int n = 0; n < 4 ; n++ ) {
			//Drop a wall to prevent loops (and confusion) in the future
			mazeToBeSolved.dropA(WALL);
			//Move the explorer in one of the four cardinal directions
			mazeToBeSolved.go(DIRECTIONS[n]);
			//Board state insertable here (debugging)
			//The real recursion (looks as far forward downs the path starting with the move intiated on line 29 and sees if any path woud lead to a result wiht the explorer on the treasure)
			if(solve(mazeToBeSolved)) return true;
			//Go back to the previous safe snapshot
			mazeToBeSolved = new Maze(snapshot);
			//Another board state insertable here (debugging
			}
		}
		//The real backtracking (If the explorer is on a wall, move back until next a safe spot on maze
		return false;
	}
}
