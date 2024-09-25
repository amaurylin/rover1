public class Rover {

	int x;
	int y;
	char direction;
	Plateau plateau;
	
	public Rover (int x, int y, char direction, Plateau plateau) {
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.plateau = plateau;
	}
	
	public void instruction(String instructions) {
		for (char instruction : instructions.toCharArray()) {
			if (instruction == 'L') {
				turnLeft();
			}
			else if (instruction == 'R') {
				turnRight();
			}
			else if (instruction == 'M') {
				move();
			}
			
		}
		
	}
	
	
	public void turnLeft() {
		
		if (direction == 'N') {
			direction = 'W';
		}
		else if (direction == 'W') {
			direction = 'S';
		}
		else if (direction == 'S') {
			direction = 'E';
		}
		else if (direction == 'E') {
			direction = 'N';
		}
	}
	
	
	public void turnRight() {
		if (direction == 'N') {
			direction = 'E';
		}
		else if (direction == 'E') {
			direction = 'S';
		}
		else if (direction == 'S') {
			direction = 'W';
		}
		else if (direction == 'W') {
			direction = 'N';
		}
	}
	
	public void move() {
		int xSave = x;
		int ySave = y;
		switch (direction) {
		case 'N' : ySave++;
		break;
		case 'E' : xSave++;
		break;
		case 'S' : ySave--;
		break;
		case 'W' : xSave--;
		break;
		}
		
		if (plateau.validePosition(xSave, ySave)) {
			x = xSave;
			y = ySave;
		}
	}
	
	public String getPosition() {
		return x + "," + y + "," + direction;
	}
	
	
	
}
