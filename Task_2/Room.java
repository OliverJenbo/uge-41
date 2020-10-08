package Task_2;

public class Room {
int walls;
int doors;
int numberOfLamps;
int windows;


    public Room(int walls, int doors, int numberOfLamps, int windows){
this.walls = walls;
this.doors = doors;
this.numberOfLamps = numberOfLamps;
this.windows = windows;



}

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getLamps() {
        return numberOfLamps;
    }

    public int getWindows() {
        return windows;
    }
    public int getNumberOfLamps(){
        return numberOfLamps;
    }
}
