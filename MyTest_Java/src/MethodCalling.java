import java.util.Scanner;

public class MethodCalling {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		TestClass Object = new TestClass();
		System.out.println("enter name: ");
		String Var = Input.nextLine();
		Object.friendName(Var);
		Object.input2();
		

	}

}
