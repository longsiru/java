package test.prac02;
/*
 * 基本数据类型之间的运算规则
 * 前提：只是其中的7种（除去了boolean）基本数据类型的运算
 * 
 * 1.自动类型提升: 当容量小的数据类型的变量与容量大的数据类型变量做运算时，结果自动提升为容量大的数据类型
 * byte / char / short ---> int ---> long ---> float ---> double
 * 特别的：当byte / char / short 三种类型(自身包括)的变量做运算时，结果为int型。
 * 
 * 2.强制类型转换：VariableTest3
 * 
 * 说明：此时的容量大小指的是，表示是的范围的打个小，比如：flaot容量要大于long的容量。
 */


public class VariableTest2 {
	public static void main(String[] args) {
		byte b1 = 2;
		int i1 = 129;
		//byte b2 = b1 + i1;  //x
		int i2 = b1 + i1;
		long l1 = b1 + i1;
		System.out.println(i2); //131
		System.out.println(l1);  //131
		
		float f = b1 + i1;
		System.out.println(f); //131.0
		
		short s1 = 123;
		double d1 = s1;
		System.out.println(d1);  //123.0
		
		//*******************************************************************************8
		char c1 = 'a';
		int i3 = 0;
		int i4 = c1 + i3; //最小写int。
		System.out.println(i4);  //97.
		
		//*******************特别的**************************
		//char c1 = 'a';
		short s2 = 10;
		//short s3 = c1 + s2;  //x
		//char c2 = c1 + s2;  //x
		int i5 = c1 + s2; //o
		System.out.println(i5);
		
		//char c1 = 'a';
		byte b2 = 10;
		//char c3 = c1 + b2;//x
		int i6 = c1 + b2; //o
		System.out.println(i6);
		
		//System.out.println(c3);
		
		//byte b3 = b1 + b2; //x
		
		//****************************
		}
}
