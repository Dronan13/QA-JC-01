package box;
//класс наследник, наследует от класса Box
public class HeavyBox extends Box{
	int weight; // вес коробки
	
	HeavyBox(int w, int h, int l, int m) {
        width = w;
        height = h;
        length = l;
        boxLabel = "Heavy box";
        weight = m; // масса
    }
	
	// конструктор, для установки значений по умолчанию для размеров и заданного веса
    HeavyBox(int m) {
    	width = 10;
        height = 10;
        length = 10;
        boxLabel = "Heavy box";
        weight = m; // масса
    }
    
	// конструктор
    // инициализируем переменные с помощью ключевого слова super
    HeavyBox(int w, int h, int d, int m, String bL) {
        super(w, h, d, bL); // вызов конструктора суперкласса(класс Box)
        weight = m; // масса
    }
}
