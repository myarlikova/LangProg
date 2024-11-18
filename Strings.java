class Strings {
	public static void main(String[] args) {
		String str = new String("Строка номер один");
		String str2 = new String(str);
		String str3 = ("Строка номер три");


		System.out.println(str + " " + str2 + " " + str3);

		//Методы, работающие со строками
		
		//Проверка на эквивалентность boolean enqals(str)
		
		boolean eq;
		eq = str.equals(str2);
		System.out.println("Строки str str2 эквивалентны " + eq);
		eq = str.equals(str3);
		System.out.println("Строки str str3 эквивалентны " + eq);


		//Метод определения длины строки int length()
		int length = str.length();
		System.out.println("Длина строки str: " + length);

		//Извлечение символа по индексу char  charAt(index)
		char ch;
		ch = str.charAt(3);
		System.out.println("В строке под индексом 3: " + ch);

		for (int i = 0; i < str.length(); i++)
			System.out.println(str.charAt(i));
		System.out.println();

		System.out.println();

		//Сравнение строк 
		int result;
		result = str.compareTo("строка номер одно");
		System.out.println("Результат сравнения строк str2 и  str " + result);

		result = str.compareTo(str3);
                System.out.println("Результат сравнения строк str3 и  str " + result);

		//Поиск подстроки и вывод индекса по первому вхождению подстроки
		str3 = "од";
		result = str.indexOf(str3);
		System.out.println();

		System.out.println("Первое вхождение подстроки \"од\" в str: " + result);

		//Поиск подстроки и вывод индекса по первому вхождению подстроки
		str3 = "3";
		result = str.lastIndexOf(str3);
                System.out.println("Последнее вхождение подстроки \"три\" в str: " + result);

		str3 = "н";
                result = str.lastIndexOf(str3);
                System.out.println("Последнее вхождение подстроки \"н\" в str: " + result);

		//массивы строк
		System.out.println();
		String[] strs = {"Разные", "элементы", "массива","строк"};
		System.out.println("Исходный массив: ");
		for(String s : strs)
			System.out.println(s + " ");
		System.out.println("\n");

		strs[1] = "измененный элемент";
		strs[4] = "Новая строка один";

		System.out.println("Измененный массив: ");
                for(String s : strs)
                        System.out.println(s + " ");
                System.out.println("\n");

		//Создание подстроки 
		String substr;
		System.out.println("Выделяем подстроку из строки str: ");
		substr = str.substring(13,16);
		System.out.println("Оригинальная строка: " + str);
		System.out.println("Подстрока: " + substr);

		//Управление оператором switch при помощи строк
		String command = "cancel";
		switch(command) {
			case "connect":
				System.out.println("Подключение");
				break;
			case "cancel":
				System.out.println("Отмена");
				break;
			case "disconnect":
                                System.out.println("Отключение");
                                break;
			default:
			System.out.println("Неизвестная комманда");
                        break;
		}
		System.out.println();

		//Текстовые блоки
		String strblk = """
			Пример блока с нестандартным форматированием строк.Можно пользоваться переносом строки, табуляцией и прочими управляющими символами.
			""";
		System.out.println(strblk);

		//Аргументы коммандной строки
		
		System.out.println("Количество параметров, переданных программе: " + args.length);
		System.out.println("Список параметров: ");
		for (int i = 0; i<args.length; i++)
			System.out.println("Аргумент[" + i + "]: "+ args[i]);
		System.out.println();

		String [][] phoneNumbers = {
			{"Авторемонт", "383-262-25-0"},
			{"Деканат", "244-85-10"},
			{"Поликлиника", "353-01-02"},
			{"Сантехник", "206-08-11"},
		};
		int i2;
		if (args.length != 1)
			System.out.println("Usage: java Strings <Наименование>");
		else {
			for (i2=0; i2<phoneNumbers.length; i2++) {
				if(phoneNumbers[i2][0].equals(args[0])) {
					System.out.println(phoneNumbers[i2][0] + ":" + phoneNumbers[i2][1]);
					break;
				}
			}
			if(i2==phoneNumbers.length)
				System.out.println("Ничего не найдено");
		}





	}
}
