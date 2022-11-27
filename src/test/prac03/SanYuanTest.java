package test.prac03;
/*
 * 三元（目）运算符：
 * 		1.格式: (条件表达式)？表达式1 ： 表达式2； 
 * 			1.1.条件表达式位true，运算后的结果是表达式1
 * 			1.2.条件表达式位false，运算后的结果是表达式2
 * 			1.3.表达式1和2需要是统一的类型。
 * 		2.三元运算符可以嵌套使用。
 * 		3.三元运算符与if-else的转换：凡是可以使用三元运算符的地方都可以改写成if-else,但是if-else不一定可以改成三目运算符
 * 		  如果既可以用三元也可以用if-else的话，就用三元。
 * 		
 */
public class SanYuanTest {

	public static void main(String[] args) {
		//获取两个整数的较大值
		int m = 12;
		int n = 5;
		int max = (m > n) ? m : n;
		System.out.println(max);  //12
		
		//(m > 2) ? 2 : "n大";  //x
		//******************************************
//		String maxStr = (m > n) ? "m大" : "n大";
//		System.out.println(maxStr);  //m大
		
		
		n = 12;
		String maxStr = (m > n) ? "m大" : ((m == n) ? "m和n相等" : "n大");
		System.out.println(maxStr); 
		
		
		
		//练习：获取三个数的最大值。
		int n1 = 12;
		int n2 = 30;
		int n3 = -43;
		
		int maxStr1 = (n1 > n2) ? n1 : n2;
		System.out.println(maxStr1); //30
		int maxStr2 = (maxStr1 > n3) ? maxStr1 : n3;
		System.out.println(maxStr2); //30
		
		if(n1 > n2) {
			System.out.println(n1); 
		}else if(n2 > n3) {
			System.out.println(n2); 
		}else {
			System.out.println(n3); 
		}

	}

}
