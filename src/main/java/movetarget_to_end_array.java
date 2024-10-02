
public class movetarget_to_end_array {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2, 1, 3, 2, 2, 2, 2, 5, 6, 3, 2, 2 };
		int len = arr.length;
		int target = 2;
		String str = "";
		int index = 0;
		
	
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != target) {
				arr[index++] = arr[i];
			}
		}
		while (index < arr.length) {
			arr[index++] = target;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
