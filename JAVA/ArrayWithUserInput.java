
/**
 * ArrayWithUserInput
 */
import java.util.Scanner;
public class Test_mYjava {
    public static void main(String[] args) {
        Scanner Array_Input_1 = new Scanner(System.in);
        System.out.println("Enter the 1st Array length: ");
        int Array_Input1 = Array_Input_1.nextInt();
        Scanner Array_Input_2 = new Scanner(System.in);
        System.out.println("Enter the 2nd Array length: ");
        System.out.println("Enter the 1st Array length: ");
        int Array_Input2 = Array_Input_2.nextInt();
        int[][] Array_Input = { { Array_Input1 }, { Array_Input2 } };
        Scanner ArrayPassing = new Scanner(System.in);
System.out.println("Enter the values into the array:");
 for (int i=0; i< Array_Input.length; i++) {
	for (int j=0;j< Array_Input[i].length;j++) {
Array_Input[i][j]= ArrayPassing.nextInt();
System.out.println(Array_Input[i][j]);

    }}
}

    }

