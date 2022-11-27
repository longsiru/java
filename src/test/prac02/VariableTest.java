package test.prac02;
/*
java data type:
Sort by data type:
	1. primitive type:byte: 1byte=8bit, -128 ~ 127
					  short:2byte, -2^15 ~ 2^15-1
					  int:4byte, -2^31 ~ 2^31-1 about 2100 million, General use int
					  long:8byte, -2^63 ~ 2^61-1, Add l or L to the constant
					  float:4byte, Can only be accurate to 7 significant figures.Must add f or F to the constant.
					  double: 8byte, The default with double.
					  char: 2byte
					  boolean:

	2. reference type:class: String is a class!!!
					  interface:
					  Array[]:


Categorize variables by where they are declared
  1. member variables：
	2.local variable
*/

public class VariableTest {
	public static void main(String[] args) {
		//1. byte；-128 ~ 127 ,  short,int, long: General use int!!!
		byte b1 = 12;
		byte b2 = -128; //b2=128 doesn't compile. 
		System.out.println(b1);
		System.out.println(b2);

		short s1 = 128;
		int i1 = 1234;
		long l1 = 3414234324L;
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);

		//2. float, double: The default with double
		//float:Float numerical range is bigger than the value of long range
		double d1 = 123.3;
		System.out.println(d1 + 1);

		//float f1 = 12.3;  //have some error, The back without F
		float f1 = 12.3F;
		System.out.println(f1);


		//3. char: 2byte.
		//Define a char usually use single quotation marks'',

		char c1 = 'a'; //Internal can only write one character  at a time.
		System.out.println(c1);

		char c2 = '1';
		char c3 = '中';
		System.out.println(c2);
		System.out.println(c3);

		//use the Unicode to express the char.
		char c6 = '\u0043';
		System.out.println(c6);  // output: C


		//boolean: true and false
		//usually used in if, while, do while, for statements.
		boolean bb1 = true;
		System.out.println(bb1);

		boolean isMarried = true;
		if(isMarried){
			System.out.println("you can't join \"bachelor party\" \n Unfortunately!");
		}else {
			System.out.println("you should have a girlfriend");
		}



	}
}

