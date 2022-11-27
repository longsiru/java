package test.prac03;
/*
 * 位运算符：
 * 结论： 1.位运算符操作的都是整数的数据。
 *       2.<<左移： 在一定范围内，每向左移一位，相当于每乘以一次2,空位用0补
 *       3.>>右移： 在一定范围内，每向左移一位，相当于每除以一次2，最高位是1就用1，是0就用0.
 *       4.>>>无符号右移：空位补0.
 *       
 *       
 * 面试题：最高效方式的计算2*8？ ： 2 << 3, 8 << 1
 *       
  */


public class BitTest {

	public static void main(String[] args) {
		int i = 21;
		System.out.println("i << 2: " + (i << 2));  //84
		System.out.println("i << 3: " + (i << 3));  //168,每向左移一位都乘以2。
		System.out.println("i << 27: " + (i << 27));  //-1476395008，物极必反。
		
		
		int i1 = -21;
		System.out.println("i1 << 2: " + (i1 << 2));   //-84
		
		//**********************************************************************
		int m = 12;
		int n = 5;
		System.out.println("m & n: " + (m & n));  //4
		System.out.println("m | n: " + (m | n));  //13
		System.out.println("m ^ n: " + (m ^ n));  //9
		//取反“~”
		
		
		//练习：交换两个变量的值
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1= " + num1 + ", num2= " + num2 );
		//方式一：定义临时变量。（推荐）
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;
//		System.out.println("num1= " + num1 + ", num2= " + num2);
		
		//方式2：好处是不用定义临时变量。
		//弊端：1.相加操作可能会超出存储范围。 2.有局限性，只可以算数值型的。
//		num1 = num1 + num2;
//		num2 = num1 - num2;
//		num1 = num1 - num2;
//		System.out.println("num1= " + num1 + ", num2= " + num2);
		
		
		//方法三：使用位运算符,有局限性，只可以算数值型的。
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("num1= " + num1 + ", num2= " + num2);
		
		
		
		
		
		
	}

}
