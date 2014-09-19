public class Room  { //initializing
	private String wallcolor; 
	private Integer window;
	private String floor;
	
	public Room () { //default constructor
		wallcolor = "No wallcolor";
		window = 0;
		floor = "No floor";
	}
			
	public Room (String wallcolor, int window, String floor) { // set methods
		this.wallcolor = wallcolor;
		this.window = window;
		this.floor = floor;
	}

	public void setWallcolor (String wallcolor) { //sets wallcolor
		wallcolor = this.wallcolor; 
	}
	public void setWindow(Integer window) { //sets window
		window = this.window;
	}
	public void setFloor(String floor) { //sets floor
		floor = this.floor;
	}

	public String  getWallcolor() { //get wallcolor
		return this.wallcolor;
	}
	public Integer getWindow() { //get window
		return this.window;
	}
	public String getFloor() { //get floor
		return this.floor;
	}
	
}