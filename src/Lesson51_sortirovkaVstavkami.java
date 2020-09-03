/*Сортировка вставками - алгоритм сортировки, в котором элементы вхоной последовательности просматриваются по одному,
 *  и каждый новый поступивший элемент размещается в подходящее место среди ранее упорядоченных элементов*/
public class Lesson51_sortirovkaVstavkami {

	public static void main(String[] args) {
		int [] array = new int [10];
		fill(array);
		print(array);
		sort(array);
		print(array);
	}
	static void fill(int [] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
	}
	static void print(int [] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println("array[" + i + "]" + "=" + array[i]);
		System.out.println();
	}
	static void sort(int [] array) {
		for(int i = 1; i < array.length; i++) {
			if(array[i] < array[i-1]) {
				int currentItem = array[i];
				int currentMovedIndex = i;
				while ((currentMovedIndex > 0) && (currentItem < array[currentMovedIndex-1])) {
					array[currentMovedIndex] = array[currentMovedIndex-1];
					currentMovedIndex--;		
				}
				array[currentMovedIndex] = currentItem;
			}
		}
	}
				
}
	


