package test.prac02;
/*
 * 变量运算规则的两个特殊情况。
 * 
 * 
 */


public class VariableTest4 {
	public static void main(String[] args) {
		//编码情况1:
		long l = 123213;  //忘了写l，没有报错。 因为默认变成了int型了自动类型提升了。
		System.out.println(l);  //123213
		
		//long l1 = 21332423235234123;  //报错了,过大的整数，因为超过了int的范围。
		long l1 = 21332423235234123L;
		System.out.println(l1);
		
		
		float f1 = 12.3f; //float 必须加fF。
		System.out.println(f1);
		
		
		//*****************************************************************************************
		 
		//编码情况2:
		//整型常量，默认类型为int； 
		//浮点型常量，默认类型为double。
		byte b = 12;
		//byte b1 = b + 1;  //1在这里是整型常量，默认为int。
		
		//float f2 = b + 13.2;  //编译失败因为浮点默认为double。
		float f2 = (float) (b + 13.2);
		System.out.print(f2); //25.2
		
		}
}
