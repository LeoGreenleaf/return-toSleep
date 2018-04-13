# return-to_sleep-

## personnel
Leo Greenleaf and Mai Rachlevsky

## statement of problem
Returns the Boolean value of the statement “the maze is navigable, having a legal travel path that is continuous from start point to existing treasure”
Navigate a maze form start to finish legal means:
	don’t cross the walls,
	right-angle turns only,
	a path cannot go through the same point twice.

## recursive abstraction
When I am asked to:
find the legal travel path that is continuous from start point to existing treasure,
the recursive abstraction can:
find the legal travel path from the next point.

## base case
When the current point is the treasure return true.
When the current point is on a wall or nto on anything(somehow) return false.

## English or pseudocode description of algorithm
If the current point is the treasure, return true.
Otherwise, analyze the current point and the four adjacent points. Discard any of the points which have previously been the current point or that are walls. For the remainder of the points, solve the maze beginning with each of those points becoming the current point.
## class(es), with fields and methods
Displayer class:
fields - windowheight, console
methods - constructor, atTopOfWindow

Maze class:
fields - TREASURE, WALL, STEPPING_STONE, NORTH, EAST, SOUTH, WEST, maze, MAX_RANKS, rankCount, explorerPosition, rank (in Vector class), file ("")
methods - constructors, toString, go, explorerIsOnA, contructors (in Vector class), add (""), equals ("")

UserOfMaze class:
fields - displayer
methods - main, moveTest, dropTest, copyConstructTest, displayerTest, snapshotDemo
## version*n* wish list
Minimal bugs.
Returns properly.
## known bugs
When working with a completely empty maze, will return false, followed by and error message. Some changes, like replacing stepping stones with walls are sometimes permanent, meaning reuse of mazes is harder than it should be.
