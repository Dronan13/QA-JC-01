
public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����� ������ � ������� 

		System.out.println("My first java programm"); 

		//���������� ���������� 

		int x; //������������� (integer) 

		x = 10; //���������� �������� 

		double a = 10.2; //������� � ����������� ��������� (double) 

		//�������������� �������� 

		int V = 1, V2 = 1; 

		V = V + V2; // ��������� ���������� V ����� �������� �������� V � V2 

		System.out.println("Value (V + V2) = "+ V);  

		V ++; //��������� �������� V �� 1, ���������� V=V+1 

		System.out.println("Value (V++) = "+ V); 

		V --; //���������� �������� V �� 1, ���������� V=V-1 

		System.out.println("Value (V--) = "+ V); 

		double D = 1.0; 

		System.out.println("Value(D/5) = "+ (D/5)); 

		//���������������� ���������� � ������������ ��������� 

		V = 2147483647; 

		System.out.println("Value = "+ V); 

		//������� Value = 2147483647

		//����������� ���������� 

		V += 2; 

		System.out.println("Value = "+ V); 

		//������� Value = -2147483647 

		boolean b,c; //��������� (boolean) 

		b=true; //���������� ��� ������ ��������� �������� true 

		c=false; //��� false 

		System.out.println("b = "+ b); 

		//��������������� �������� 

		x += V2;//�������� x = x + b 

		x -= V2; //�������� x = x - b 

		x *= V2; //�������� x = x * b 

		a /= V2; //�������� x = x / b 

		a %= V2; //�������� x = x % b, ��� % - ������� �� ������� 

		System.out.println("������� �� ������� � = "+ a); 

		b &= c; //�������� x = x & b 

		b |= c; //�������� x = x | b 

		//���������� �������� 

		int p = 9; 

		int q = 65; 

		int r = -12; 

		// ��������� ���������� �������� ��������� ����������� �������� 

		// true - �����������, false - �� ����������� 

		boolean cmp; 

		cmp = p<q; System.out.println(cmp);//������ 

		cmp = q>p; System.out.println(cmp);//������ 

		cmp = r>=q; System.out.println(cmp);//������ ����� 

		cmp = r<=q; System.out.println(cmp);//������ ����� 

		// ��������� ��������� 

		cmp = p==q; System.out.println(cmp);//����� 

		cmp = q!=p; System.out.println(cmp);//�� ����� 

		//������ � ������� 

		String str; //������ 

		str = "������ 1"; 

		System.out.println(str); 

		char ch = 'a'; //C������ 

		System.out.println(ch); 

		//�������������� �������� 

		System.out.println(Math.abs(-2.33)); // ������ ����� 

		System.out.println(Math.round(Math.PI)); // ����������� ����� PI, ������� 3 

		System.out.println(Math.round(9.5)); // ����������� ����� 9.5, ������� 10 

		double z = Math.sqrt(3*3 + 4*4); //���������� ������ 

		System.out.println(c); // ������� ���������� ������������ � �������� 3 � 4 

		double s1 = Math.cos(Math.toRadians(60));//������� �� ���� 60 �������� 

		System.out.println(s1); // ������� ������� ���� � 60 �������� 

		//���������� ����� 

		double a1 = 3; 

		System.out.println(a1); // ������� 3.0

		  /* ���������������� � �������
		* ���������� ���� double ��������������� �������� �� ������ �����, �� � ���������� ����� �����, 

		* �.�. ���������� � ���������� ��������� �������� 3.0 (��� ����� � ���� �������), 

		* ������� ����� � ��������� �� �����.
		*/
		//int a = 3.14; // ������ 

		int a2 = (int) 3.14; 

		System.out.println(a2); // ������� 3 

		/* 

		 * ������������� ������������ �������� � ������ �����. 

		 * ��� ����� ����� ���� ������� � ��������� � ���� ���������, 

		 * ������ ����� �� ��������� �������� ������� ������� �������� ����, 

		 * � �������� ��� ����� ��������. 

		 */ 

		double b1 = 2.6; 

		int c1 = (int) (0.5 + b1); // ����� ��������� � ����� ���������� 

		System.out.println(c1); // ������� 3 

		System.out.println((int)9.69); // ������� 9 

		System.out.println((int)'A'); // ������� 65 � ��� ������� �A� 

		System.out.println((double)3); // ������� 3.0 

		double z1=1/3; 

		System.out.println(z1); // ������� 0.0

		z1=(double)1/3; 

		System.out.println(z1); // ������� 0.33333

		z1 = Math.pow(9, 1/3); 

		System.out.println(z1); 

		// ������� 1, �.�. 1/3 ���������� int(����� ����� �� 1/3 = 0) 

		z1 = Math.pow(9, (double)1/3); 

		System.out.println(z1); // ������� 2.0801...
	}

}
