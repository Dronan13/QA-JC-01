package lessons.oop.ballsInBox;
public class MainClass {

	public static void main(String[] args) {
		/*
		 * —оздать коробку в которую будут складыватьс€ м€чики определенного радиуса.
		 * ќпределить сколько м€чиков можно сложить на дно коробки.
		 * »сход€ из занимаемого места в коробке м€чиками, сформировать массив двумерный
		 * с соответсвующим колличеством элементов, где кажда€ €чейка будет представл€ть из 
		 * себ€ объект класса м€ч. 
		 */
		BoxWithBalls boxWithBalls = new BoxWithBalls(32,5,12);
		int ballRadius = 4;
		
		//определим количество м€чей по ширине и длинне
		int dimWidth=boxWithBalls.getWidth()/ballRadius;
		int dimLength=boxWithBalls.getLength()/ballRadius;
		
		System.out.println("ѕо ширине будет "+dimWidth +" шарика");
		System.out.println("ѕо ширине будет "+dimLength +" шарика");
		
		boxWithBalls.setBallsDimension(dimWidth, dimLength);
		boxWithBalls.setRandomBalls(ballRadius);
		boxWithBalls.getBall(2, 2);//убрали м€чик из коробки
		boxWithBalls.getAllBallsColor();
	}

}
