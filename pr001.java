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
	        //Символьный тип данных
		char ch;//16
		ch = 'A';
		ch++;
		for (int i=0; i<68; i++)
			System.out.print(ch++ + " ");
		System.out.println();
		// Логический тип
		boolean bool;
		bool = true;
		bool = false;

	}


}








