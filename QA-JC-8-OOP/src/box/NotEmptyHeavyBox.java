package box;
public class NotEmptyHeavyBox extends HeavyBox{
	
	int density;// добавл€ем плотность в коробку
	/*
	 * конструктор
	 * инициализируем переменные с помощью ключевого слова super
	 * дл€ данного класса суперкласс будет HeavyBox
	 */
	NotEmptyHeavyBox(int m, int d) {
		super(m);
		density = d;
	}

}
