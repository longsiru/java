package test.prac04;



/*
 * 如何从键盘获取不同类型的变量：需要使用到Scanner类
 * 
 * 具体实现步骤
 * 	1.导包：import java.util.Scanner;
 * 	2.Scanner的实例化。
 * 	3.调用Scanner类的相关方法，来获取指定类型的变量
 * 
 *
 *对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串。
 *
 *注意：需要根据相应的方法，来输入指定类型的值，如果输入的数据类型与要求的类型不匹配，会报异常：InputMisMacthException.导致程序终止。
 * 
 */


import java.util.Scanner;


public class ScannerTest {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);  //造了个对象
//		int num = scan.nextInt();
//		System.out.println(num);
		
		//*********************
//		Scanner scan1 = new Scanner(System.in);  //造了个对象
//		System.out.println("请输入您的名字");
//		String name = scan1.next();
//		System.out.println("您的名字： " + name);
		
		//**********************************
//		Scanner scan2 = new Scanner(System.in);  //造了个对象
//		System.out.println("请输入您的年龄");
//		int age = scan2.nextInt();
//		System.out.println("您的年龄： " + age);
		
		//**************************************
//		Scanner scan3 = new Scanner(System.in);  //造了个对象
//		System.out.println("请输入您的体重");
//		double weight = scan3.nextDouble();
//		System.out.println("您的体重： " + weight);
		
		
		Scanner scan3 = new Scanner(System.in);  //造了个对象
		System.out.println("您是否单身? (true/false)");
		boolean isLove = scan3.nextBoolean();
		System.out.println(isLove);
		
		
		
		
		
		
		
		}

}
