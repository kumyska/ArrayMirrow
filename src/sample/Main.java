package sample;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Написать код для зеркального переворота массива. Например (7,2,9,4) -> (4,9,2,7). 
//		Массив может быть произвольной длинны. Использовать дополнительный массив запрещено
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		
		mirrowArr(arr);
		System.out.println(" Mirrow array \n" + Arrays.toString(arr));
	}

	public static int[] mirrowArr(int[] array) {		
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[array.length - i - 1];
			array[array.length - i - 1] = array[i];
			array[i] = temp;
		}
		return array;
	}
	   
}
