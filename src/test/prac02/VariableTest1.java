package test.prac02;

/*
Use of variables
1.Java defines the format of variables: Type Variatename = Variatevalue

2.state
	Variables must be declared and assigned before they can be used
	Variables are defined within their scope and are valid within the scope.
	You cannot declare two variables with the same name in the same scope

*/


public class VariableTest1 {
	public static void main(String[] args) {
		//Definition of variables
		int myAge = 12;
		//Use of variables
		System.out.println(myAge);

		//Declaration of variables
		int myNumber;
		//The assignment of a variable
		myNumber = 1001;

		System.out.println(myNumber);
	}
}
