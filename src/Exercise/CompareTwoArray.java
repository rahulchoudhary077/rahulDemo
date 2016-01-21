package Exercise;

public class CompareTwoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40 };
		int b[] = { 20, 10, 40 };
		
		//int t = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {
				if (a[i]!= b[j]) {

					System.out.println("if is " + a[i]);
					break;

				}

				

			}

		}

	}


}