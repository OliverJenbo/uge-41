package Task_2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;


    public Building(List<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.isOfficeBuilding = false;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

}