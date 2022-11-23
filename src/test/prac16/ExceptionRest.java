package test.prac16;

import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
 * 一、异常的体系结构
 * 
 * java.lang.Throwable
 * 	|---java.lang.error: 一般不编写针对性的代码进行处理。
 * 	|---Java.lang.exception:可以进行异常的处理
 * 		|exception:
 * 			|---1.checked exception：编译时异常  1.IOException-->FileNotFoundException:文件未找到异常
 * 											 2.ClassNotFoundException:指定的类不存在
 * 																		
 * 			|---2.unchecked exception：运行时异常 1.NullPointerException:空指针访问异常
 *                                            2.ArrayIndexOutOfBoundsException:数组索引越界异常
 *                                            3.ClassCastException:数据类型转换异常
 *                                            4.NumberFormatException:字符串转换为数字异常
 *                                            5.InputMismatchException:输入类型不匹配异常
 *                                            6.ArithmaticException:算术条件异常
 * 
 * 面试题：常见的异常都有哪些？举例说明。
 */
public class ExceptionRest {
	
	//ArithmaticException:算术条件异常
	@Test
	public void test6() {
		int a = 10;
		int b = 2;
		System.out.println(a / b);  //5,正确
		
		int a1 = 10;
		int b1 = 0;
		System.out.println(a1 / b1);  //错误， by zero
	}
	
	
	
	//InputMismatchException:输入类型不匹配异常
	@Test
	public void test5() {
//		Scanner scanner = new Scanner(System.in);  //ctrl+shift+o:improt
//		int score = scanner.nextInt();
//		System.out.println(score);  //输入123正确，输入abc报错。
	}
	
	
	
	
	//NumberFormatException:字符串转换为数字异常
	@Test
	public void test4() {
		String str = "123";
		str = "abc";
		int num = Integer.parseInt(str);//"abc"错误，因为本身就不是一个数值类型的。
		
	}
	
	//ClassCastException:数据类型转换异常
	@Test
	public void test3() {
		Object obj = new Date();
		String str = (String)obj;  //编译的时候出现异常左边会有提示
	}
	
	

	//IndexOutOfBoundsException:（索引）角度越界异常
	@Test
	public void test2() {
		//ArrayIndexOutOfBoundsException:数组(索引)角度越界异常
//		int[] arr = new int[10];
//		System.out.println(arr[10]); //只要不在0-9范围内都算异常
		
		
		//StringIndexOutOfBoundsException:字符串(索引)角度越界异常
//		String str = "abc";  //索引：012， 没有3
//		System.out.println(str.charAt(3)); //所以这里出项异常
		
		
		
	}
	
	//NullPointerException:空指针访问异常
	@Test
	public void test1() {
		
//		int[] arr = null;
//		System.out.println(arr[3]);
		
//		String str = "abc";
//		str = null;
//		System.out.println(str.charAt(0));
	}
	


}
