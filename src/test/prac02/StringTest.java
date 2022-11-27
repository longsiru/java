package test.prac02;
/*
 * String类型变量的使用
 *   1. String属于引用数据类型，翻译为:字符串
 *   2.声明String类型变量时，使用一对"".
 *   3.String可以和8种基本数据类型变量做运算，且运算只能是链接运算： +   
 * 
 * 
 */


public class StringTest {
	public static void main(String[] args) {
		//1
		String s1 = "Hello World";
		System.out.println(s1);
		
		//2
		String s2 = "a"; //从0 开始。愿意放多少就放多少。里面的每一个都是一个字符（char）。多了就叫（String）
		String s3 = "";//什么都没放
		System.out.println(s2);
		System.out.println(s3);
		
		//char c = ' ';//里面有且只能放一个字符（char），现在放的是空格。
		//System.out.println(c);
		
		//***************************************************************************************************
		//3
		int number = 1001;
		String numberStr = "学号： ";
		String info = numberStr + number;  //链接运算： + 
		System.out.println(info); //学号： 1001
		
		boolean b = true;
		String info1 = info + b;
		System.out.println(info1);  //学号： 1001true
		
		
		//***********************************************************************************************************
		//练习
		char c = 'a'; //a=97, A=65.
		int num = 10;
		String str = "hello";
		System.out.println(c + num + str);  //107hello: 97 + 10 + hello
		System.out.println(c + str + num);  //ahello10  
		System.out.println(c + (num + str));  //a10hello
		System.out.println((c + num) + str);  //107hello
		System.out.println(str + num + c);   //hello10a
		
		
		//练习2
		//*	* :想在控制台输出：* tab *
		System.out.println("*	*");  //o
		System.out.println('*' + '\t' + '*');  //x
		System.out.println('*' + "\t" + '*');  //o
		System.out.println('*' + '\t' + "*");  //x
		System.out.println('*' + ('\t' + "*"));  //o
		
		
		//******************************************************************************
		//String str1 = 123;//x
		//String str1 = "123"; //o
		String str1 = 123 + "";  //o
		System.out.println(str1);  
		
		//int num2 = str1;
		//int num2 = (int)str1;//x
		
		int num3 = Integer.parseInt(str1); //o  
		System.out.println(num3);//123
		
		
		
		
		
		
		
		
		
		
		
		}
}
