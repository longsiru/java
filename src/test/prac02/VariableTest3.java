package test.prac02;
/*
 * 强制类型转换：自动类型提升运算的逆运算
 *   1. 需要使用强制转符:()
 *   2.注意点： 强制类型转换，可能会导致精度损失。
 * 
 * 
 */


public class VariableTest3 {
	public static void main(String[] args) {
		
		double d1 = 12.9;
		
		int i1 = (int)d1; //截断操作。损失精度。
		System.out.println(i1);  //12
		
		//不损失精度的情况。
		long l1 = 123;
		short s2 = (short)l1;
		System.out.println(s2);  //123
		
		//精度损失。
		int i2 = 128;
		byte b1 = (byte)i2;
		System.out.println(b1);  //-128
		
		
		}
}
