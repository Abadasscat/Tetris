package tetris;

public class Tee extends Piece {
	public Tee(TetrisData data) {
		super(data);
		c[0] = 0;
		c[1] = -1;
		c[2] = 1;
		c[3] = 0;
		
		r[0] = 0;
		r[0] = 0;
		r[0] = 0;
		r[0] = 1;
	}
	
	public int getType() {
		return 2;
	}
	
	public int roteType() {
		return 4;
	}
}