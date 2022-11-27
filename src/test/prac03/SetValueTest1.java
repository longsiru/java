package test.prac03;
/*
 * 赋值运算符：=， +=， -=， /=， %=
 *   1.符号：=：当“=”两侧数据类型不一致时，可以使用自动类型转换或使用强制类型转换原理进行处理。
 *   2.支持连续赋值
 * 
 */
public class SetValueTest1 {

	public static void main(String[] args) {
		//赋值符号：=
//		int i1 = 10;
//		int j1 = 10;
//		
//		int i2,j2;
//		//连续赋值
//		i2 = j2 = 10;
//		
//		int i3 = 10,j3 = 20;
		
		
		//*******************************************************************************************
		// +=
		int num1 = 10;
		num1 += 2;  //num1 = num1 + 2;
		System.out.println(num1);  //12
		
		//注意
		short s1 = 10;
		//s1 = s1 + 2;//报错，编译失败
		s1 += 2;//可以,因为不会改变变量本身的数据类型。
		System.out.println(s1);  //12
		
		//开发中，如果希望变量实现+2的操作，有几种方法？（前提： int num = 10;）
		//方式一： num = num + 2;
		//方式二： num += 2;  (推荐)
		
		//开发中，如果希望变量实现+1的操作，有几种方法？（前提： int num = 10;）
		//方式一： num = num + 1;
		//方式二： num += 1; 
		//方式三： num++；  (推荐)
		
		
		//练习1
		int i = 1;
		i *= 0.1;
		System.out.println(i);  //0
		i++;
		System.out.println(i);  //1
		
		
		
		//练习2
		int m = 2;
		int n = 3;
		n *= m++;
		System.out.println("m= " + m);  //3
		System.out.println("n= " + n);  //6
		
		
		int n1 = 10;
		n1 += (n1++) + (++n1);  //n1 = n1 + n1++ +  ++n= 10+10+12=32
		System.out.println(n1); //32
		
	}

}
