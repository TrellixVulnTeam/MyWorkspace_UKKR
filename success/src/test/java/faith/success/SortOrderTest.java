package faith.success;

public class SortOrderTest {

	public static void main(String[] args) {

		int[] arrval = new int[] { 50, 80, 20, 60, 70, 89 };

		for (int i = 0; i < arrval.length; i++) {

			for (int j = i + 1; j < arrval.length; j++) {

				if (arrval[i] > arrval[j]) {

					int temp = arrval[i];
					arrval[i] = arrval[j];
					arrval[j] = temp;

				}
				
				
				}
			
			
			}
		
		System.out.println("After Sort");
		
		for(int num : arrval){
			System.out.println(num);

		}

	}

}
