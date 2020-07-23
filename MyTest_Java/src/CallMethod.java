import java.util.Scanner;

public class CallMethod {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		CallingMethod Object = new CallingMethod();
		System.out.println("Enter name: ");
		String Myname = Input.nextLine();

		Object.myMethod(Myname);
 
		// System.out.println("starting the another class");

		// CallingMethod MyObject = new CallingMethod();

		// MyObject.myMethod();

	}

}
