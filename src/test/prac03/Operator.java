package test.prac03;
/*
 * 运算符：
 * 전위연산자,후위연산자.
 * 前++：先自增1，然后再运算
 * 后++：先运算，后自增1
 * 前--：先自减1，然后运算
 * 后--：先运算，后自减1.
 */
public class Operator {

	public static void main(String[] args) {
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("b1 = " + b1);  //11
		
		int a2 = 10;
		int b2 = a2++;
		System.out.println("b2 = " + b2);  //10
		
		//注意：
		short s1 = 10;  //想让s1自增1
		//s1 = s1 + 1; //编译失败
		s1 = (short)(s1 + 1); //正确的
		s1++;  //正确，自增1不会改变本身变量的数据类型
		
		//问题：
		byte by1 = 127;
		by1++;
		System.out.println("by1 = " + by1);  //-128
		
 
		//부호 연산자.
//		int x = -100;
//		x = -x;
//		System.out.println(x);
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x= " + x);
		
		
		System.out.println("------------");
		y--;
		--y;
		System.out.println("y= " + y);
		
		System.out.println("------------");
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("------------");
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		
		System.out.println("------------");
		z = ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}

}
