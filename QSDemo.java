class  Quicksort {
	//Вызов фактического метода быстрой сортировки
	static void qsort(char[] items) {
		qs(items, 0, items.length-1);
	}

	//рекурсивная версия быстрой сортировки
	private static void qs(char[] items, int left, int right) {
		int i, j;
		char x, y;
		i = left; j = right;
		x = items[(left + right)/2];

		do {
			while ((items[i] < x) && (i < right))
				i++;
			while((x < items[j]) && (j > left)) 
				j--;

			if (i<=j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);
		if (left < j) qs(items, left,j);
		if (i < right) qs(items, i, right);

	}
}

class QSDemo {
	public static void main(String[] args) {
		char[] a = {'d','a','f','e','z','k','w','f','c','m','w'};
		int i;
		System.out.print("Исходный массив: ");
		for (i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.print();
		//Сортировка
		Quicksort.qsort(a);
		System.out.print("Отсортированный массив: ");
		for (i = 0; i < a.length; i++)
                        System.out.print(a[i]);
                System.out.print();		
                System.out.print("Исходный массив: ");
                for (i = 0; i < a.length; i++)
                        System.out.print(a[i]);
                System.out.print();



	}
}
