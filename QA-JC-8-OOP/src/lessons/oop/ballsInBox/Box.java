package lessons.oop.ballsInBox;

public class Box {
	int width; 	// параметры
	int height; // отвечают за ширину, 
	int length; // высоту и длинну коробки, 
	
	Box(int width, int height, int length){
		this.width = width; 
		this.height = height; 
		this.length = length; 
	}
	
	Box(){

	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

}
