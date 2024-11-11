//Пузырьковая сортировкаc
class Bubbles {
	public static void main (String[] args) {
		int [] nums = {34, 353, 521, 24 -242, -10, 583,32, 122, -44};
		int a, b, t, vnesh=0, vnut=0;
		int size;

		size = 10;

		//отображение исходного массива
		System.out.println("Исходный массив: ");
		for (int i=0; i < size; i++)
			System.out.println(" " + nums[i]);
		System.out.println();
		//Сортировка 
		for (a=1; a<size; a++) {
			System.out.println("Иттерация: " + a + "внешний цикл");
			vnesh++;
			for(b=size-1; b>=a; b--) {
				System.out.println("Иттерация: " + a + "внутренний цикл");
				vnut++;
				if (nums[b-1] > nums[b]) {
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		}

		//Отображение отсортированного массива
		System.out.println("Отсортированный массив: ");
		for (int i=0; i < size; i++)
                        System.out.println(" " + nums[i]);
		System.out.println();
		System.out.println("Количество внешних проходов: " + vnesh +  "\nКоличество внутренних" + vnut);
		System.out.println();



	}
}
