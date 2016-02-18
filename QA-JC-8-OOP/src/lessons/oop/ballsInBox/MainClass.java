package lessons.oop.ballsInBox;
public class MainClass {

	public static void main(String[] args) {
		/*
		 * ������� ������� � ������� ����� ������������ ������ ������������� �������.
		 * ���������� ������� ������� ����� ������� �� ��� �������.
		 * ������ �� ����������� ����� � ������� ��������, ������������ ������ ���������
		 * � �������������� ������������ ���������, ��� ������ ������ ����� ������������ �� 
		 * ���� ������ ������ ���. 
		 */
		BoxWithBalls boxWithBalls = new BoxWithBalls(32,5,12);
		int ballRadius = 4;
		
		//��������� ���������� ����� �� ������ � ������
		int dimWidth=boxWithBalls.getWidth()/ballRadius;
		int dimLength=boxWithBalls.getLength()/ballRadius;
		
		System.out.println("�� ������ ����� "+dimWidth +" ������");
		System.out.println("�� ������ ����� "+dimLength +" ������");
		
		boxWithBalls.setBallsDimension(dimWidth, dimLength);
		boxWithBalls.setRandomBalls(ballRadius);
		boxWithBalls.getBall(2, 2);//������ ����� �� �������
		boxWithBalls.getAllBallsColor();
	}

}
