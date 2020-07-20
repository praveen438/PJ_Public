import java.util.Scanner;

//1.	Passing the user input and then finding this Position of any element in an array:
public class Test2 {
	// the class name is the name you mentioned during the creation of class and
	// cannot be changed
	public static void main(String[] args) {
		// method name is "main" which is mandatory and it should be in small letters
		// int[][] myRow = { { 16, 12, 9, 34, 19, 21, 37, 82 }, { 36, 24, 34, 9, 48 } };
		Scanner Arry_Length_1 = new Scanner(System.in);
		System.out.println("Enter the Length of the 1D array: ");
		int Arry_Length_1D = Arry_Length_1.nextInt();
		Scanner Arry_Length_2 = new Scanner(System.in);
		System.out.println("Enter the Length of the 2D array: ");
		int Arry_Length_2D = Arry_Length_2.nextInt();
		int[][] myRow = new int[Arry_Length_1D][Arry_Length_2D];
		// System.out.println(myRow);
		// System.out.println("enter the values here:");
		Scanner object = new Scanner(System.in);
		System.out.println("Enter the values into  array: ");
		for (int p = 0; p < Arry_Length_1D; p++) {
			for (int n = 0; n < Arry_Length_2D; n++) {
				myRow[p][n] = object.nextInt();
			}
		}
		Scanner Y = new Scanner(System.in);
		System.out.println("Enter the value to search in array: ");
		int X = Y.nextInt();
		int Counter = 0;
		// System.out.println("Positionof i:" + "\t" + "Positionof j:" + "\t" + "Vlaue
		// at position[i][j]");// "\t" used for
		// space
		for (int i = 0; i < myRow.length; i++) {
			System.out.println(i + "\t" + myRow[i]);
			for (int j = 0; j < myRow[i].length; j++) {
				if (X == myRow[i][j]) {
					Counter++;
					System.out.println(i + "\t" + j + "\t" + myRow[i][j]);
				}
				// System.out.println(i +"\t"+ j + "\t"+myRow[i][j]);
			}
			
		}
		if (Counter > 0) {
			System.out.println("Total no.of times the value exists in entire array " + Counter);
		} else {
			System.out.println("CounterValue is:" + Counter + " So, No number Exists in the array ");
		}
	}
}