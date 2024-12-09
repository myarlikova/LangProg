abstract class TwoDShape {
	private double width;
	private double height;
	final int CONST1 = 1;
	final int CONST2 = 2;
	final int CONST3 = 3;
	String name;
	int i = 100;

	TwoDShape(double w, double h) {
		if (h > 29.7)
                        height = 29.7;
                else
                        height = h;
		if (w > 21.0)
                        width = 21.0;
                else
                        width = w;

		name = "Двумерная фигура";
	}
	double getWidth () {
		return width;
	}
	double getHeight () {
                return height;
        }

	void setWidth (double w) {
                if (w > 21.0)
			width = 21.0;
		else
			width = w;
        }


	void setHeight (double h) {
                if (h > 29.7)
                        height = 29.7;
                else
                        height = h;
        }




	void showDim() {
		System.out.println("Размеры фигуры: " + width + " х " + height);
	}
	/*
	String showName() {
		return name;
	}
	*/

	/*
	double area() {
		System.out.println("Метод должен быть переопределен!");
		return 0.0;
	*/

	//Метод который гобязательно должен переопределиться внутри класса
	abstract double area();
	abstract void getMsg();
}

class Triangle extends TwoDShape {
	String style;
	int i = 10;
	TRiangle(String s,double w, double h) {
		super(w,h); //вызов конструктора суперкласса
		style = s;
		name = "треугольник";
	double area() {
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("Стиль: " + style);
	}

	//Демострация доступа к одноименной переменной суперкласса
	int showSuperI() {
		return super.i;
	}
	/*String showName() {
		return super.name;
	}
	*/
	

}

class ColorTriangle extends Triangle {
	String color;
	ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h); //вызов конструктора Triangle();
		color = c;
		name = "Цветной треугольник";
	}
	void showColor() {
		Systeem.out.println("Цвет: " + color);
	}
/*	void getMsg() {
                System.out.println("Цвет " + color);
        }
*/

	String toString() {
		return "Цветной треугольник";
	}

}

class Rectangle extends TwoDShape {
	Rectangle(String o,double w, double h) {
                super(w,h);
                outLine  = o;
		name = "прямоугольник";
	}
	String outline;
	double area() {
		return getWidth() * getHeight();
	}
	boolean isSquare() {
		if (getWidth()== getHeight())
			return true;
		return false;
	}
	final void getMsg() {
		System.out.println();
	}
}

final class X {
	int x = 10;
}
/*
class Y extends X {
	int y = 20;
}
*/
class Interihance {
	public static void main(String[] args) {
	TwoDShape fig1 = //new TwoDShape(20.0, 30.0);
	Triangle t1 = new Triangle("Закрашенный", 4.5, 7.0);
	ColorTriangle t2 = new ColorTriangle("Синий","Контурный", 3.5, 8.0);
	Rectangle r1 = new Rectangle("Сплошная линия" 5.0, 5.0);
	Rectangle r2 = new Rectangle("Пунктирная линия", 5.0, 7.0);
	System.out.println(" ");
	//System.out.println("fig1" + fig1.name);
	//fig1.showDim();
	System.out.println("t1:" + t1.name);
	t1.showStyle();
	System.out.println("Площадь" + t1.area());

	//t1.showName();
	System.out.println();

	System.out.println("r1" + r1.name);
        System.out.println("Квадрат" + r1.isSquare());
        System.out.println("Площадь" + r1.area());
	System.out.println(t1.i);
	System.out.println(t1.showSuperI());


	//Совместимость родственных переменных родствнных класов
	//Переменная суперкласса может ссылаться на объект любого подкласса
	//
	System.out.println();
	System.out.println("Ширина двумерной фигуры fig1 "fig1.getWidth());
	System.out.println("Имя фигуры: " + fig1.name);

	//при указании на объект суперкласса выполняется метод суперкласса
	fig1.area();

	fig1 = t1;
	System.out.println("Ширина треугольника, на который ссылается fig1"fig1.getWidth());
	System.out.println("Имя фигуры: " + fig1.name);
	fig1.getMsg();

	//при указании на объект подкласса выполняется вычислние площади треугольника
	fig1.area();
	System.out.println("Площадь треугольника" + fig1.area());
	System.out.println("Имя фигуры: " + fig1.name);

	///при указании на объект подкласса выполняется вычислние площади прямоугольника
	fig1 = r1;
	System.out.println("Ширина прямоугольника, на который ссылается fig1"fig1.getWidth());
	fig1.area();
	System.out.println("Площадь прямоугольника" + fig1.area());
	System.out.println("Имя фигуры: " + fig1.name);

	fig1 = t2;
	t2.showColor();
	System.out.println("Площадь цветного треугольника" + fig1.area());
	System.out.println("Имя фигуры: " + fig1.name);
	fig1.getMsg();
	System.out.println((fig1.CONST1 + fig1.CONST2 + fig1.CONST3));
	//Izmenit nelzia
	//fig1.CONST1 = 333;

	//Доступ к членам подкласса для ссылочных переменных суперкласса закрыт
	//System.out.println(fig1.style);


	//Проверка доступности переменных
	/*
	System.out.println(fig1.width);
	System.out.println(t1.width); //Podklass imeet dosyup k peremennum u metodam superklacca
	System.out.println(fig1.style);//
	*/
	

	//Использование класса Object
	Object obj1;
	System.out.println(t1.getClass());
	System.out.println(t2.getClass());
	System.out.println(t1.hashCode() + t2.hashCode());
	System.out.println(t1.toString() + t2.toString());
	System.out.println(t1.equals(t2));
	t1= t2;
	System.out.println(t1.equals(t2));


	}
}
