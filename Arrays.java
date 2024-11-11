//работа с массивами
class Arrays {
	public static void main(String[] args){
		int [] nums = new int[10];
		//заполнение массива значениями
		for(int i = 0; i < 10; i++) 
			nums[i] = i;
	//вывод содержимого массива
		for(int i = 0; i < 10; i++)
			System.out.println("Элемент nums [" + i +"]:" + nums[i]);
		System.out.println();
	//Вывод каждого элемента массива "вручную"

	nums[0] = 32;
	nums[1] = -42;
	nums[2] = 1132;
	nums[3] = 320;
	nums[4] = 3212;
	nums[5] = 3421;
	nums[6] = 512;
	nums[7] = -5235;
	nums[8] = -24;
	nums[9] = 97;

	//Находим максимальное и минимальное значение в массиве
	int min, max;
	min = max =nums[0];
	for(int i = 0; i < 10; i++)
		if(nums[i] < min) = nums[i];
		if(nums[i] > max) = nums[i];
	}	
	System.out.println();
	System.out.println();

	//Альтернативная форма инициализации массива:
	int x = 10;
	int[] nums1 ={32, -42, 1132, 53,124,94,x,-522,-10,11};
	min = max =nums[0];
        for(int i = 0; i < 10; i++)
                if(nums[i] < min) = nums1[i];
                if(nums[i] > max) = nums1[i];
        }
        System.out.println("Min": + min "Max" + max);
        System.out.println();
}

