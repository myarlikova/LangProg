class pr001 {
	public static void main(String args []) {
		System.out.println("Первая java-программа");
		//преобразование типов данных
		
		//целые типы данных:
		byte b; //8 би
		b = -128;
		b = 127;
		b = (byte)256;
		System.out.println(b);
		short sh; // 16 бит
		sh = (short)65536;
		int intg; // 32 бит
		long l; //64System.out.println(intg);
		intg = 2000000000;
		l = intg;
		intg = intg*intg*intg;
		System.out.println(intg);
		l = l*l*l;
		System.out.println(l);
		
		//вещественные типы данных
		float f; //32
		double dd; //64
		sh = b;
		b = (byte)sh;
		dd = 1.5;
		intg =(int)dd;
		intg = (double)10/3;
		f = intg;
		System.out.println(intg + " " + dd);

	        //Символьный тип данных
		char ch;//16
		ch = 'A';
		ch++;
		for (int i=0; i<68; i++)
			System.out.print(ch++ + " ");
		System.out.println();
		ch ='0';
		System.out.println(((int)ch));
		// Логический тип
		boolean bool; bool2 = false;
		bool = true;
		System.out.println(!bool);
		System.out.println(bool || bool2);
		System.out.println(bool && bool2);
		System.out.println(bool ^ bool2);
		System.out.println("Перевод  строки\n" + "Табуляция\t" + "\"Кавычки\" в строках" + (!bool && (bool2 | bool)));
		ch = '\'';


	}


}








