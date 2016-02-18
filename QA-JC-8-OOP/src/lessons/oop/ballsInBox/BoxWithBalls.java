package lessons.oop.ballsInBox;
public class BoxWithBalls extends Box{
	
	int dimWidth;
	int dimLength;

	Ball [][] balls;
	
	BoxWithBalls(){		
	}
	
	BoxWithBalls(int width, int height, int length){
		super(width, height, length);
	}
	
	BoxWithBalls(int width, int height, int length, 
							int dimWidth, int dimLength){
		super(width, height, length);
		this.dimWidth = dimWidth;
		this.dimLength = dimLength;
	}
		
	/**
	 * @return the dimWidth
	 */
	public int getDimWidth() {
		return dimWidth;
	}

	/**
	 * @param dimWidth the dimWidth to set
	 */
	public void setDimWidth(int dimWidth) {
		this.dimWidth = dimWidth;
	}

	/**
	 * @return the dimLength
	 */
	public int getDimLength() {
		return dimLength;
	}

	/**
	 * @param dimLength the dimLength to set
	 */
	public void setDimLength(int dimLength) {
		this.dimLength = dimLength;
	}
	
	public void setDimensions(int dimWidth, int dimLength) {
		this.dimWidth = dimWidth;
		this.dimLength = dimLength;
	}
	/**
	 * @return the balls
	 */
	public Ball[][] getBalls() {
		return balls;
	}

	/**
	 * @param balls the balls to set
	 */
	public void setBalls(Ball[][] balls) {
		this.balls = balls;
	}
	
	public void setBallsDimension() {
		this.balls = new Ball[this.dimWidth][this.dimLength];
	}
	
	public void setBallsDimension(int dimWidth, int dimLength) {
		this.dimWidth = dimWidth;
		this.dimLength = dimLength;
		this.balls = new Ball[this.dimWidth][this.dimLength];
	}
	
	public void setBall(int widthIndex, int lengthIndex, int radius) {
		balls[widthIndex][lengthIndex] = new Ball(radius);
	}
	
	public void getBall(int widthIndex, int lengthIndex) {
		balls[widthIndex][lengthIndex] = null;
	}
	public void setRandomBalls(int radius) {
		for(int i = 0; i<balls.length; i++){
			for(int j = 0; j<balls[i].length; j++){
				balls[i][j] = new Ball(radius);
			}
		}		
	}
	public void getAllBallsColor() {
		for(int i = 0; i<balls.length; i++){
			for(int j = 0; j<balls[i].length; j++){
				try{
					System.out.print(balls[i][j].getColor()+" ");
				}catch(Exception e){
					System.out.print("no ball ");
				}
			}
			System.out.println();
		}		
	}




}
