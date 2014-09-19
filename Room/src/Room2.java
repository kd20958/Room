
public class Room2 {
	public static String wallcolor; 
	public static Integer window;
	public static String floor; 
	
	public static void main (String[] args) {
		Room room1 = new Room("Yellow", 1, "Hard Wood"); 
		System.out.println("Room 1: " + room1.getWallcolor() + "," + room1.getWindow() + "," + room1.getFloor());
		
		Room room2 = new Room("Purple", 0, "Tiled"); 
		System.out.println("Room 2: " + room2.getWallcolor() + "," + room2.getWindow() + "," + room2.getFloor());
		
		Room room3 = new Room("White", 3, "Carpeted"); 
		System.out.println("Room 3: " + room3.getWallcolor() + "," + room3.getWindow() + "," + room3.getFloor());

	}
}