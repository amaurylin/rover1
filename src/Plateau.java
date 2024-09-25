public class Plateau {
	
	public int maxX;
	public int maxY;
	
	public Plateau (int maxX, int maxY) {
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	public boolean validePosition(int x, int y) {
		return x >= 0 && y >= 0 && x <= this.maxX && y <= maxY;
	}
}


