
/**
 * ArrayWithUserInput
 */
import java.lang.reflect.Array;
import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;

public class Test_mYjava {
	public static void main(String[] args) {
		Scanner Array_Input_1 = new Scanner(System.in);
		System.out.println("Enter the 1st Array length: ");
		int Array_Input1 = Array_Input_1.nextInt();
		Scanner Array_Input_2 = new Scanner(System.in);
		System.out.println("Enter the 2nd Array length: ");

		int Array_Input2 = Array_Input_2.nextInt();
		int[][] Array_Input = new int[Array_Input1][Array_Input2];
		Scanner ArrayPassing = new Scanner(System.in);
		System.out.println("Enter the values into the array:");
		for (int i = 0; i < Array_Input.length; i++) {
			for (int j = 0; j < Array_Input[i].length; j++) {
				Array_Input[i][j] = ArrayPassing.nextInt();

				int y = Array_Input[i][j];

				System.out.println(Arrays.deepToString(Array_Input));
				// String z= Arrays.toString(Array_Input[i][j]);
				System.out.println("this is the value of Y:" + y);
				int x = 7;
				if (x == y) {
					System.out.println("this is the value of Y:" + y);
				}

			}
		}

		System.out.println(Arrays.deepToString(Array_Input));

	}

}
