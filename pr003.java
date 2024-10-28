class Cars {
	int pass;// количество пассажиров
	int volume; //объем бака
	double fuel;//расход топлива в литрах
		    //
	
	void range() {
		System.out.println("Расстояние на полном баке:" + volume/fuel*100));
	}
	double range2() {
		return volume/fuel*100;
	}
	double range3(int x) {
		returnx/fuel*100;
	}
}

clas pr003 {
	public static void main(String[] args) {
		Cas Honda = new Cars();
		Honda.pass = 2;
		Honda.volume = 55;
		Honda.fuel = 20.0;
		Cars = BMW = new Cars();
		BMW.pass = 5;
		BMW.volume = 40;
		BMW.fuel = 15.5;

		System.out.println("Параметры Хонды:");
		System.out.println("Колмичество пассажиров: " + Honda.pass + "Объём бака" + Honda.volume + "Расход топлива" + Honda.fuel);

		System.out.println("Хонда на полном баке проедет" );
		Honda.range();
		System.out.println("Для хонды :" Honda.range2());
		BMW.range()
		System.out.println("Параметры Хонды:"+ BMW.range3(15));
	}
}
