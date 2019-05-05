package punts;

public class Punt {
	
    //private static final int[][] coord = null;
	private int x, y; 
    //int[] z= coord[2];
    //z[0]=x;
	//z[1]=y;// coordenades del punt
    public Punt() { this(0, 0); }
    public Punt(int x, int y) { this.x=x; this.y=y; }
    public int getX() { return x; }
    public int getY() { return y; }
	public void setX(int x) {
		this.x = x;
	}	
	public void setY(int y) {
		this.y = y;
	}
	public  static int suma(int x, int y) { return x+y;}
	
	public static double versinegativo (int x) {
		if(x<0) {
			throw new IllegalArgumentException();
		}
		return x;
	}
}