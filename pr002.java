class pr002 {
	public static void main(String args [])
			throws java.io.IOException {
		int intg = 10, intgr = 20;
		char ch, answer = 'R' ;
		ch = (char) System.in.read();
		if (ch == answer)
			System.out.println("Угадали буквы");
		else {
			System.out.print("Нужная буква по алфавиту");
			if (ch < answer)
				System.out.println("Ниже, чем указанная");
			else
				System.out.println("Выше, чем указанная");
		}

		boolean bool;
		//int i;
		for(int i=0; i<10; i++)
			switch(i {
				case 0:
					System.out.println("i = 0"))
					break;
				case 1:
					System.out.println("i = 1");
					break;
				case 2:
					System.out.println("i = 2");
					break;
				case 3:
					System.out.println("i = 3");
					break;
				case 4:
					System.out.println("i = 4");
					break;
				default:
					System.out.println("i = 5 или больше");

			}
		if (!bool)
			System.out.println("bool равен true");
		else
			System.out.println("bool равен false");
		System.out.println("\n");
		//оператор for
		for(int i=0, j=10; i<j; i++, j--)
			System.out.println("i и j: " + i + " " + j);

	}
}
