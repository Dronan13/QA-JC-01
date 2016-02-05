
public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//вывод строки в консоль 

		System.out.println("My first java programm123"); 

		//объявление переменных 

		int x; //целочисленная (integer) 

		x = 10; //присвоение значения 

		double a = 10.2; //дробная с присвоенным значением (double) 

		//арифметические операции 

		int V = 1, V2 = 1; 

		V = V + V2; // присвоить переменной V сумму текущего значения V и V2 

		System.out.println("Value (V + V2) = "+ V);  

		V ++; //увеличить значение V на 1, эквивалент V=V+1 

		System.out.println("Value (V++) = "+ V); 

		V --; //уменьшение значение V на 1, эквивалент V=V-1 

		System.out.println("Value (V--) = "+ V); 

		double D = 1.0; 

		System.out.println("Value(D/5) = "+ (D/5)); 

		//Инициализировали переменную с максимальным значением 

		V = 2147483647; 

		System.out.println("Value = "+ V); 

		//Выведет Value = 2147483647

		//Переполняем переменную 

		V += 2; 

		System.out.println("Value = "+ V); 

		//Выведет Value = -2147483647 

		boolean b,c; //логиеская (boolean) 

		b=true; //логический тип данных принимает значение true 

		c=false; //или false 

		System.out.println("b = "+ b); 

		//Комбинированные операции 

		x += V2;//означает x = x + b 

		x -= V2; //означает x = x - b 

		x *= V2; //означает x = x * b 

		a /= V2; //означает x = x / b 

		a %= V2; //означает x = x % b, где % - остаток от деления 

		System.out.println("остаток от деления а = "+ a); 

		b &= c; //означает x = x & b 

		b |= c; //означает x = x | b 

		//Порядковые операции 

		int p = 9; 

		int q = 65; 

		int r = -12; 

		// результат порятковых операций принимает логическоге значение 

		// true - выполняется, false - не выполняется 

		boolean cmp; 

		cmp = p<q; System.out.println(cmp);//Меньше 

		cmp = q>p; System.out.println(cmp);//Больше 

		cmp = r>=q; System.out.println(cmp);//Больше равно 

		cmp = r<=q; System.out.println(cmp);//Меньше равно 

		// Операторы равенства 

		cmp = p==q; System.out.println(cmp);//Равно 

		cmp = q!=p; System.out.println(cmp);//Не равно 

		//Строки и символы 

		String str; //Строки 

		str = "Строка 1"; 

		System.out.println(str); 

		char ch = 'a'; //Cимволы 

		System.out.println(ch); 

		//Математические операции 

		System.out.println(Math.abs(-2.33)); // Модуль числа 

		System.out.println(Math.round(Math.PI)); // Округленное число PI, выведет 3 

		System.out.println(Math.round(9.5)); // Округленное число 9.5, выведет 10 

		double z = Math.sqrt(3*3 + 4*4); //Квадратный корень 

		System.out.println(c); // выведет гипотенузу треугольника с катетами 3 и 4 

		double s1 = Math.cos(Math.toRadians(60));//Косинус от угла 60 градусов 

		System.out.println(s1); // выведет косинус угла в 60 градусов 

		//Приведение типов 

		double a1 = 3; 

		System.out.println(a1); // выведет 3.0

		  /* преобразованного в радианы
		* Переменная типа double предусматривает хранение не только целой, но и десятичной части числа, 

		* т.е. фактически в переменную запишется значение 3.0 (три целых и ноль десятых), 

		* которое потом и выведется на экран.
		*/
		//int a = 3.14; // ошибка 

		int a2 = (int) 3.14; 

		System.out.println(a2); // выведет 3 

		/* 

		 * преобразовать вещественное значение к целому можно. 

		 * Для этого нужно явно сообщив в программе о своём намерении, 

		 * указав слева от исходного элемента круглых скобках название типа, 

		 * к которому его нужно привести. 

		 */ 

		double b1 = 2.6; 

		int c1 = (int) (0.5 + b1); // можно применять к целым выражениям 

		System.out.println(c1); // выведет 3 

		System.out.println((int)9.69); // выведет 9 

		System.out.println((int)'A'); // выведет 65 — код символа «A» 

		System.out.println((double)3); // выведет 3.0 

		double z1=1/3; 

		System.out.println(z1); // выведет 0.0

		z1=(double)1/3; 

		System.out.println(z1); // выведет 0.33333

		z1 = Math.pow(9, 1/3); 

		System.out.println(z1); 

		// выведет 1, т.к. 1/3 возвращает int(целое число от 1/3 = 0) 

		z1 = Math.pow(9, (double)1/3); 

		System.out.println(z1); // выведет 2.0801...
	}

}
