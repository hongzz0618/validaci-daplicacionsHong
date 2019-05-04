package punts;

public class Segment {
	int x1=100;
	int x2=2;
	int y1=100;
	int y2=5;
	int logitud;
	 Punt p1 = new Punt(x1,x2);
	 Punt p2 = new Punt(y1,y2);
	 
	 public Segment() { 
		 }
	public Segment(Punt p1, Punt p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	public Punt getP1() {
		return p1;
	}
	public void setP1(Punt p1) {
		this.p1 = p1;
	}
	public Punt getP2() {
		return p2;
	}
	public void setP2(Punt p2) {
		this.p2 = p2;
	}
	
	public int longitud() {
	logitud = (int) Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	return logitud;
	}
}
