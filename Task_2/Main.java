package Task_2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(8, 3, 2, 3);
        Room room2 = new Room(8, 3, 6, 6);
        Room room3 = new Room(12, 4, 12, 8);


        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building1 = new Building(rooms, 8, 2, false);
        Building building2 = new Building(rooms, 8, 2, true);

        int lamps = 0;
        for (Room r: building1.getRooms()) {
            lamps += r.getNumberOfLamps();
        }
        System.out.println(lamps);

    }
}
