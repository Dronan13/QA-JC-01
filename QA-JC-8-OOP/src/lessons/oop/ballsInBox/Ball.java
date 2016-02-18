package lessons.oop.ballsInBox;
import java.util.Random;

public class Ball {
	int radius;
	String color;
	
	
	Ball(int radius){
		this.radius = radius;
		Random rnd = new Random();
		if(rnd.nextDouble()>=0.5){
			this.color = "black";
		}else{
			this.color = "yellow";	
		}
		
	}
	
	Ball(int radius, String color){
		this.radius = radius;
		this.color = color;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	void setRadius(int radius){
		this.radius=radius;
	}
	
	int getRadius(){
		return radius;
	}
	
	int getDiameter(){
		return 2*radius;
	}

}
