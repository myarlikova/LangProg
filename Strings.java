class Strings {
	public static void main(String[] args) {
		String str = new String("Строка номер один");
		String str2 = new String(str);
		String str3 = ("Строка номер три");


		System.out.println(str + " " + str2 + " " + str3);

		//Методы, работающие со строками
		
		//Проверка на эквивалентность boolean enqals(str)
		
		boolean eq;
		eq = str.enquals(str2);
		System.out.println("Строки str str2 эквивалентны " + eq);
		eq = str.enquals(str3);
		System.out.println("Строки str str3 эквивалентны " + eq);


		//Метод определения длины строки int length()
		int length = str.length();
		System.out.println("Длина строки str: " + length);

		//Извлечение символа по индексу char  charAt(index)
		char ch;
		ch = charAt(3);
		System.out.println("В строке под индексом 3: " + ch);

		for (int i = 0; i < length(); i++)
			System.out.println((str.charAt(i))
		System.out.println();


	}
}
